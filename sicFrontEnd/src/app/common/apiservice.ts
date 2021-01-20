import { Observable, throwError } from "rxjs";
import { HttpClient, HttpHeaders, HttpErrorResponse, HttpParams } from '@angular/common/http';
import { catchError } from 'rxjs/operators'
import { Injectable } from "@angular/core";


@Injectable()
export class APIService {

    constructor(
        public _httpclient: HttpClient,
      ) { }

    /**
 * Envia informacion al API 
 * @param url  donde se va recibir la informacion que se envia
 * @param body  lo que se va enviar al API
 * @param options 
 */
  post(url: string, body: any): Observable<any> {

    return this._httpclient
      .post<any>(url, body)
      .pipe(catchError( this.controlExcepcion ))
      
  }



/**
 * Obtiene los datos del API en la url enviada
 * @param url de la peticion
 *   
 */
  get(url: string): Observable<any> {
    console.log(url);
    console.log(this._httpclient);
    return this._httpclient
      .get<any>(url)
      .pipe(catchError( this.controlExcepcion ))
      
  }



  
/**
 *Extrae  la respuesta y la convierte en un objeto de tipo JSON 
 * @param res 
 */
  private extractData(res: Response) {
    return res.json();
  }

  /**
 *Extrae  la respuesta y la convierte en un  texto 
 * @param res 
 */
private extractDataFromMessage(res: Response) {
  return res.text();
}

  /**
   * Metodo para el manejo de errores
   * @param error  generado por la peticion 
   */
  private handleError(error: Response | any) {
    let errObj: any;

    if (error instanceof Response) {
      const body = error.json();
      errObj = body;
    } else {
      errObj = error.message ? { message: error.message } : { message: error };
    }

    return Observable.throw(errObj);
  }
  controlExcepcion( _error: HttpErrorResponse ){
    console.log(_error);
    return throwError(_error);
  }  
}
