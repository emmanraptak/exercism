class Darts {
    int score(double xOfDart, double yOfDart) {

        double distFromCentre = Math.sqrt(Math.pow(xOfDart,2) + Math.pow(yOfDart,2));

        if (distFromCentre <= 1) return 10;
        else if (distFromCentre <= 5) return 5;
        else if (distFromCentre <= 10) return 1;
        else return 0;
    }
}
