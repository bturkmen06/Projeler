
package tr.gov.ptt.customerregprime.bean;

import java.util.Date;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import tr.gov.ptt.customerregprime.util.JSFUtil;

@ManagedBean(name = "cust")
@SessionScoped
public class CustRegBean {
    
    private String ad;
    private String soyad;
    private String sifre;
    private java.util.Date dogtar;
    
    private String Sokak;
    
    private String evTel;
    private String cepTel;

    public CustRegBean() {
        dogtar=new java.util.Date();  //ilk değer ataması yaparak bugün tarihini takvimde göstermiş olduk
        
        ad="";
        soyad="";
        sifre="";
        Sokak="";
    }

    public String getEvTel() {
        return evTel;
    }

    public void setEvTel(String evTel) {
        this.evTel = evTel;
    }

    public String getCepTel() {
        return cepTel;
    }

    public void setCepTel(String cepTel) {
        this.cepTel = cepTel;
    }

    public String getSokak() {
        return Sokak;
    }

    public void setSokak(String Sokak) {
        this.Sokak = Sokak;
    }
    
    
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Date getDogtar() {
        return dogtar;
    }

    public void setDogtar(Date dogtar) {
        this.dogtar = dogtar;
    }
    
    public String kaydetCustomer()
    {
        System.err.println(ad+"  "+soyad+" adli müşteri kaydedildi !  " );
        
        
        
        //FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Kayit başarılı",ad+" "+soyad+" başarıyla tamamlandı." ));
        
       // FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
        
        JSFUtil.mesajEkle("Kayıt başarılı: ", ad+" "+soyad+" başarıyla kaydedildi");
        
        
        return "result.xhtml?faces-redirect=true";
    }
    
    
    public String giris()
    {
        ad="";
        soyad="";
        sifre="";
        Sokak="";
        return "custreg2.xhtml?faces-redirect=true";
    }
    
}
