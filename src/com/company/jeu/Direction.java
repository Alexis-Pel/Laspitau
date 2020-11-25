package com.company.jeu;

public class Direction {
    public enum Direction {
        NORD, EST, SUD, OUEST, Q, TOUTES;

        /**
         * Change une direction donnée
         *
         * @param s La direction
         * @return Une direction
         */
        public static Direction change(String s) {
            Direction dir = Direction.TOUTES;

            if (s.equals("NORD"))
                return Direction.NORD;

            else if (s.equals("SUD"))
                return Direction.SUD;

            else if (s.equals("OUEST"))
                return Direction.OUEST;

            else if (s.equals("EST"))
                return Direction.EST;

            else if (s.equals("Q"))
                return Direction.Q;
            else
                return dir;
             }
        }
    }

