package me.nicou.tuntikirjaus.bean;

import java.util.Date;

public class ProjektiImpl implements Projekti {

	int id;
	String nimi;
	String kuvaus;
	Date luontipaiva;
	MerkintaLista merkintaLista;

	public ProjektiImpl() {
		super();
	}

	public ProjektiImpl(int id, String nimi, String kuvaus, Date luontipaiva,
			MerkintaLista merkintaLista) {
		super();
		this.id = id;
		this.nimi = nimi;
		this.kuvaus = kuvaus;
		this.luontipaiva = luontipaiva;
		this.merkintaLista = merkintaLista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	public Date getLuontipaiva() {
		return luontipaiva;
	}

	public void setLuontipaiva(Date luontipaiva) {
		this.luontipaiva = luontipaiva;
	}

	public MerkintaLista getMerkintaLista() {
		return merkintaLista;
	}

	public void setMerkintaLista(MerkintaLista merkintaLista) {
		this.merkintaLista = merkintaLista;
	}

	@Override
	public String toString() {
		return "ProjektiImpl [id=" + id + ", nimi=" + nimi + ", kuvaus="
				+ kuvaus + ", luontipaiva=" + luontipaiva + ", merkintaLista="
				+ merkintaLista + "]";
	}

}
