package Model.database.RingNoCoating;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NoCoating")
public class RingNoCoatingParameters {

	@Id
	@GeneratedValue
	private int id;
	private String Eto;
	private double DiameterNom;
	
	public RingNoCoatingParameters(String eto, double diameterNom) 
	{
		super();
		Eto = eto;
		DiameterNom = diameterNom;
	}
	
	RingNoCoatingParameters(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEto() {
		return Eto;
	}

	public void setEto(String eto) {
		Eto = eto;
	}

	public double getDiameterNom() {
		return DiameterNom;
	}

	public void setDiameterNom(double diameterNom) {
		DiameterNom = diameterNom;
	}
	
	
	
	@Override
	public String toString() {
		return "RingNoCoatingParameters [id=" + id + ", Eto=" + Eto + ", DiameterNom=" + DiameterNom + "]";
	}

	public void setValues(String eto, double diameterNom)
	{
		this.Eto=eto;
		this.DiameterNom=diameterNom;
		setEto(Model.main.Main.getSealingRingNoCoatingController().getEto().getText());
		setDiameterNom(Double.parseDouble(Model.main.Main.getSealingRingNoCoatingController().getDiameterNom().getText()));
	}
}
