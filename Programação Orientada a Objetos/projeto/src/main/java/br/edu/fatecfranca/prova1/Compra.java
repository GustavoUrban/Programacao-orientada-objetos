
package br.edu.fatecfranca.prova1;

import java.util.Date;


public class Compra {
    private int id;
    private Date data;
    private Figurinha figura;
    private Album album;
  
    public Compra(int id, Date data, Figurinha figura, Album album) {
        this.id = id;
        this.data = data;
        this.figura = figura;
        this.album = album;
    }

     public Compra() {
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        public Date getData() {
            return data;
        }

            public void setData(Date data) {
                this.data = data;
            }

    public Figurinha getFigura() {
        return figura;
    }

        public void setFigura(Figurinha figura) {
            this.figura = figura;
        }

                public Album getAlbum() {
                    return album;
                }

        public void setAlbum(Album album) {
            this.album = album;
        }

            @Override
            public String toString() {
                return """
                       Compra{
                        ID:""" + id + "\n Data:" + data + "\n Figura:" + figura + "\n Album:" + album + '}';
            }
        
    
}