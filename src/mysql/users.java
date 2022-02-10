package mysql;

    public class  users {
    int ide; String name,brth,avrrg,rsob,mj;

        public users(int ide, String name, String brth, String avrrg, String rsob, String mj) {
            this.ide = ide;
            this.name = name;
            this.brth = brth;
            this.avrrg = avrrg;
            this.rsob = rsob;
            this.mj = mj;
        }


        public int getIde() {
            return ide;
        }

        public void setIde(int ide) {
            this.ide = ide;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBrth() {
            return brth;
        }

        public void setBrth(String brth) {
            this.brth = brth;
        }

        public String getAvrrg() {
            return avrrg;
        }

        public void setAvrrg(String avrrg) {
            this.avrrg = avrrg;
        }

        public String getRsob() {
            return rsob;
        }

        public void setRsob(String rsob) {
            this.rsob = rsob;
        }

        public String getMj() {
            return mj;
        }

        public void setMj(String mj) {
            this.mj = mj;
        }
    }



