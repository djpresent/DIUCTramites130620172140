package ucuenca.tramitesdiuc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class informe_final implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(generator = "INFORME_FINAL_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "INFORME_FINAL_ID_SEQ", name = "INFORME_FINAL_ID_GENERATOR")
   private java.lang.Long id;

   private java.lang.String informe_final;

   private java.lang.String observaciones;

   @org.kie.api.definition.type.Label(value = "acta_finiquito_elaborada")
   private java.lang.Boolean acta_finiquito_elaborada;

   @org.kie.api.definition.type.Label(value = "informacion_emitida_ci")
   private java.lang.Boolean informacion_emitida_ci;

   public informe_final()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getInforme_final()
   {
      return this.informe_final;
   }

   public void setInforme_final(java.lang.String informe_final)
   {
      this.informe_final = informe_final;
   }

   public java.lang.String getObservaciones()
   {
      return this.observaciones;
   }

   public void setObservaciones(java.lang.String observaciones)
   {
      this.observaciones = observaciones;
   }

   public java.lang.Boolean getActa_finiquito_elaborada()
   {
      return this.acta_finiquito_elaborada;
   }

   public void setActa_finiquito_elaborada(
         java.lang.Boolean acta_finiquito_elaborada)
   {
      this.acta_finiquito_elaborada = acta_finiquito_elaborada;
   }

   public java.lang.Boolean getInformacion_emitida_ci()
   {
      return this.informacion_emitida_ci;
   }

   public void setInformacion_emitida_ci(java.lang.Boolean informacion_emitida_ci)
   {
      this.informacion_emitida_ci = informacion_emitida_ci;
   }

   public informe_final(java.lang.Long id, java.lang.String informe_final,
         java.lang.String observaciones,
         java.lang.Boolean acta_finiquito_elaborada,
         java.lang.Boolean informacion_emitida_ci)
   {
      this.id = id;
      this.informe_final = informe_final;
      this.observaciones = observaciones;
      this.acta_finiquito_elaborada = acta_finiquito_elaborada;
      this.informacion_emitida_ci = informacion_emitida_ci;
   }

}