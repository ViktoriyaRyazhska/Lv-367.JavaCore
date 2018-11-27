/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exsercisel4;

/**
 *
 * @author Taras
 */
public enum HTTPError {
    Not_Found(404),
    Forbidden(403),
    Method_Not_Allowed(405),
    Not_Acceptable(406);

    private int description;

    private HTTPError(int description) {
        this.description = description;
    }

    public int getDescription() {
        return description;
    }
}
