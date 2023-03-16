public class Hub {
    protected Contenedor[][] m; //¿protected?

    public Hub() {
        this.m = new Contenedor[10][12];
        //filas = m.length
        //Columnas de la fila i = m[i].length
    }

    public Contenedor[][] getM() {
        return m;
    }

    public void setContenedor() {
        if (m != null) {
            this.m = m;
        }
    }

    public String toString() {
        String s = new String();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == null) {
                    s += "[N]";
                } else {
                    s += "[" + m[i][j].getId() + "]";
                }
            }
            s += "\n";
        }
        s += "\n";
        return s;

    }
/*
    public Contenedor desapilar(int col) {
        if (col < 0 || col >= m[0].length) {
            return null;
        } else {
            for (int i = 0; i < m.length; i++) {
                if (m[i][col] != null) {
                    Contenedor aux = m[i][col];
                    m[i][col] = null;
                    return aux;
                }
            }
            return null;
        }
    }


    public void apilar(Contenedor c) {
        if (c != null) {
            int p = c.getPrioridad();
            if (p == 1 || p == 2) {
                int col = p - 1;
                for (int i = m.length - 1; i >= 0; i--) {
                    if (m[i][col] == null) {
                        m[i][col] = c;
                        return;
                    }
                }
            } else {
                for (int j = 2; j < m[0].length; j++) {
                    for (int i = m.length - 1; i >= 0; i--) {
                        if (m[i][j] == null) {
                            m[i][j] = c;
                            return;
                        }
                    }
                }
            }
        }
    }
    */





}
