package LN;

import java.io.Serializable;
import java.util.Random;

import LP.PJPrincipal;

public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nick;
	private int money;
	private int lvl;
	private int vida;
	private int velocidad;
	private int ataque;
	private int defensa;
	private PJPrincipal pjLinked;

	public User(String nomb) 
	{
		nick=nomb;
		money=100;
		lvl=1;
		vida=20;
		ataque=10;
		defensa=3;
		velocidad=5;
	}

	public String getNick() {
		return nick;
	}

	public int getMoney() {
		return money;
	}

	public int getLvl() {
		return lvl;
	}

	public PJPrincipal getPjLinked() {
		return pjLinked;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public void setPjLinked(PJPrincipal pjLinked) {
		this.pjLinked = pjLinked;
	}
	
	public void daño(int ataque)
	{
		int Daño=ataque-this.getDefensa();
		if(Daño>0)
		{
		this.setVida(this.getVida()-Daño);
		}
	}

	public void lvlup()
    {
        Random r1=new Random();
        int a=r1.nextInt(2);

        if(this.velocidad<15)
        {
            this.velocidad++;
        }

        if(a==1)
        {
            this.ataque=this.ataque+2;
        }

        if(a==0)
        {
            this.defensa++;
        }
        this.vida=this.vida+4;
        this.lvl++;
        this.money= this.money-100;
    }
	
	
}
