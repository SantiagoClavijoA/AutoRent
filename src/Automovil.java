    public class Automovil extends Vehiculo {
        private int numeroPuertas;

        public Automovil(String placa, String marca, String modelo, int año, EstadoVehiculo estado, double tarifa, int numeroPuertas) {
            super(placa, marca, modelo, año, estado, tarifa);
            this.numeroPuertas = numeroPuertas;
        }

        public int getNumeroPuertas() {
            return numeroPuertas;
        }

        public void setNumeroPuertas(int numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
        }

        @Override
        public double calcularTarifa() {
            return getTarifa() * getTarifabase();
        }

        @Override
        public String toString() {
            return super.toString() + ", Automovil{" +
                    "numeroPuertas=" + numeroPuertas +
                    '}';
        }
    }

