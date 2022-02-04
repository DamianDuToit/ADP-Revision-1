package za.ac.cput;

/*
Date: 04 February 2022
Author: Damian du Toit
Student Number: 219200203
Subject: ADP372S
 */

public class TVShows
{
    String[] shows, debutDate, endDate;

    public TVShows()
    {
        this.shows[0] = "Breaking Bad";
        this.shows[1] = "Game of Thrones";
        this.shows[2] = "Arrow";
        this.shows[3] = "How I Met Your Mother";

        this.debutDate[0] = "20 January 2008";
        this.debutDate[1] = "17 April 2011";
        this.debutDate[2] = "10 October 2012";
        this.debutDate[3] = "19 September 2005";

        this.endDate[0] = "29 September 2013";
        this.endDate[1] = "19 May 2019";
        this.endDate[2] = "28 January 2020";
        this.endDate[3] = "31 March 2014";
    }

    //Getters
    public String getShows1()
    {
        return shows[0];
    }
    public String getShows2()
    {
        return shows[1];
    }
    public String getShows3()
    {
        return shows[2];
    }
    public String getShows4()
    {
        return shows[3];
    }

    public String getDebutDate1()
    {
        return debutDate[0];
    }
    public String getDebutDate2()
    {
        return debutDate[1];
    }
    public String getDebutDate3()
    {
        return debutDate[2];
    }
    public String getDebutDate4()
    {
        return debutDate[3];
    }

    public String getEndDate1()
    {
        return endDate[0];
    }
    public String getEndDate2()
    {
        return endDate[1];
    }
    public String getEndDate3()
    {
        return endDate[2];
    }
    public String getEndDate4()
    {
        return endDate[3];
    }

    // Setters
    public void setShows1()
    {
        this.shows[0] = shows[0];
    }
    public void setShows2()
    {
        this.shows[1] = shows[1];
    }
    public void setShows3()
    {
        this.shows[2] = shows[2];
    }
    public void setShows4()
    {
        this.shows[3] = shows[3];
    }

    public void setDebutDate1()
    {
        this.debutDate[0] = debutDate[0];
    }
    public void setDebutDate2()
    {
        this.debutDate[1] = debutDate[1];
    }
    public void setDebutDate3()
    {
        this.debutDate[2] = debutDate[2];
    }
    public void setDebutDate4()
    {
        this.debutDate[3] = debutDate[3];
    }

    public void setEndDate1()
    {
        this.endDate[0] = endDate[0];
    }
    public void setEndDate2()
    {
        this.endDate[1] = endDate[1];
    }
    public void setEndDate3()
    {
        this.endDate[2] = endDate[2];
    }
    public void setEndDate4()
    {
        this.endDate[3] = endDate[3];
    }

    // toString()
    @Override
    public String toString()
    {
        return "Here are some TV shows, their debut dates and their end dates:\n\n" + "TV Show 1: " + shows[0]
                + ", Debuted: " + debutDate[0] + ", End date: " + endDate[0] + "\n" + "TV Show 2: " + shows[1]
                + ", Debuted: " + debutDate[1] + ", End date: " + endDate[1] + "\n" + "TV Show 3: " + shows[2]
                + ", Debuted: " + debutDate[2] + ", End date: " + endDate[2] + "\n" + "TV Show 4: " + shows[3]
                + ", Debuted: " + debutDate[3] + ", End date: " + endDate[3];
    }
}
