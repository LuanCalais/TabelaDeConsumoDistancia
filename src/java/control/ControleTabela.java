/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Valores;

/**
 *
 * @author luanc
 */
@WebServlet(name = "ControleTabela", urlPatterns = {"/ControleTabela"})
public class ControleTabela extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String Percurso = request.getParameter("rdPercurso");
            String Combustivel = request.getParameter("rdCombustivel");
           
            
            
            if(Percurso.equals("1") && Combustivel.equals("1") ){
                
                Valores valores = new Valores("1", "1");
                request.setAttribute("tipos", valores);
                ArrayList<Integer> resultados = valores.UrbanoAlcool();
                request.setAttribute("resultados", resultados);
                
                RequestDispatcher rd = request.getRequestDispatcher("Tabela.jsp");
                rd.forward(request, response);
                
            }else{
                if(Percurso.equals("1") && Combustivel.equals("2")){    
                    
                    Valores valores = new Valores("1", "2");
                    request.setAttribute("tipos", valores);
                    ArrayList<Integer> resultados = valores.MesmoKm();
                    request.setAttribute("resultados", resultados);
                    
                    RequestDispatcher rd = request.getRequestDispatcher("Tabela.jsp");
                    rd.forward(request, response);
                    
            }else{
                    if(Percurso.equals("2") && Combustivel.equals("1")){
                         
                        Valores valores = new Valores("2", "1");
                        request.setAttribute("tipos", valores);
                        ArrayList<Integer> resultados = valores.MesmoKm();
                        request.setAttribute("resultados", resultados);
                        
                        RequestDispatcher rd = request.getRequestDispatcher("Tabela.jsp");
                        rd.forward(request, response);
                        
                    }else{
                         Valores valores = new Valores("2", "2");
                         request.setAttribute("tipos", valores);
                         ArrayList<Integer> resultados = valores.EstradaGasolina();
                         request.setAttribute("resultados", resultados);
                         
                         RequestDispatcher rd = request.getRequestDispatcher("Tabela.jsp");
                         rd.forward(request, response);
                    }
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
