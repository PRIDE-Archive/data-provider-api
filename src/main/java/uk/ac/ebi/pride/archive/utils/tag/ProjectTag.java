package uk.ac.ebi.pride.archive.utils.tag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/** A collection of project tags. */
public enum ProjectTag {
  BIOLOGICAL("Biological", "Biological", ProjectTagType.PRIDE_INTERNAL),
  BIOMEDICAL("Biomedical", "Biomedical", ProjectTagType.PRIDE_INTERNAL),
  TECHNICAL("Technical", "Technical", ProjectTagType.PRIDE_INTERNAL),
  CARDIOVASCULAR("Cardiovascular", "Cardiovascular", ProjectTagType.PRIDE_INTERNAL),
  METAPROTEMOICS("Metaproteomics", "Metaproteomics", ProjectTagType.PRIDE_INTERNAL),
  REFERENCE("Reference", "RefData", ProjectTagType.PRIDE_INTERNAL),
  HIGHLIGHTED("Highlighted", "Highlighted", ProjectTagType.PRIDE_HIGHLIGHTED),
  BILS_PROJECT(
      "Bioinformatics Infrastructure for Life Sciences (BILS) network (Sweden)",
      "BILS",
      ProjectTagType.PARENT_PROJECT),
  PRIME_XS_PROJECT("PRIME-XS Project", "PRIME-XS", ProjectTagType.PARENT_PROJECT),
  HIPSIC_PROJECT(
      "Human Induced Pluripotent Stem Cells Initiative", "HipSci", ProjectTagType.PARENT_PROJECT),
  CPTAC_CONSORTIUM("CPTAC Consortium", "CPTAC", ProjectTagType.PARENT_PROJECT),
  PROTEOME_TOOLS("ProteomeTools", "ProteomeTools", ProjectTagType.PARENT_PROJECT),
  HUMAN_PROTEOME_PROJECT("Human Proteome Project", "HPP", ProjectTagType.PARENT_PROJECT),
  C_HUMAN_PROTEOME_PROJECT(
      "Chromosome-centric Human Proteome Project (C-HPP)", "C-HPP", ProjectTagType.PARENT_PROJECT),
  MALARIA_HOST_PATHOGEN_INTERACTION_CENTER(
      "Malaria Host-Pathogen Interaction Center (MaHPIC)", "MaHPIC", ProjectTagType.PARENT_PROJECT),
  BD_HUMAN_PROTEOME_PROJECT(
      "Biology/Disease-Driven Human Proteome Project (B/D-HPP)",
      "B/D-HPP",
      ProjectTagType.PARENT_PROJECT),
  BD_ANTIBODIES_HUMAN_PROTEOME_PROJECT(
      "Antibodies (B/D-HPP)", "HAI (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_BRAIN_HUMAN_PROTEOME_PROJECT(
      "Human Brain Proteome Project (HUPO_HBPP) (B/D-HPP)",
      "HBPP (B/D-HPP)",
      ProjectTagType.PARENT_PROJECT),
  BD_CANCER_HUMAN_PROTEOME_PROJECT(
      "Cancer (B/D-HPP)", "Cancer (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_CV_HUMAN_PROTEOME_PROJECT(
      "Cardiovascular (B/D-HPP)", "Cardiovascular (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_DIABETES_HUMAN_PROTEOME_PROJECT(
      "Diabetes (B/D-HPP)", "HDPP (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_EPIGENETIC_HUMAN_PROTEOME_PROJECT(
      "Epigenetic Chromatin (B/D-HPP)",
      "Epigenetic Chromatin (B/D-HPP)",
      ProjectTagType.PARENT_PROJECT),
  BD_EXTREME_CONDITIONS_HUMAN_PROTEOME_PROJECT(
      "Extreme Conditions (B/D-HPP)",
      "Extreme Conditions (B/D-HPP)",
      ProjectTagType.PARENT_PROJECT),
  BD_EYEOME_HUMAN_PROTEOME_PROJECT(
      "EyeOME (B/D-HPP)", "EyeOME (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_FOOD_NUTRITION_HUMAN_PROTEOME_PROJECT(
      "Food and Nutrition (B/D-HPP)", "FaN (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_GLUCOPROTEOMICS_HUMAN_PROTEOME_PROJECT(
      "Glycoproteomics (B/D-HPP)", "HGPI (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_IMMUNO_PEPTIDOMEHUMAN_PROTEOME_PROJECT(
      "Human Immuno-Peptidome Project (HUPO-HIPP)",
      "HIPP (B/D-HPP)",
      ProjectTagType.PARENT_PROJECT),
  BD_iMOP_HUMAN_PROTEOME_PROJECT("iMOP (B/D-HPP)", "iMOP (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_KIDNEY_URINE_HUMAN_PROTEOME_PROJECT(
      "Kidney Urine (B/D-HPP)", "HKUPP (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_LIVER_HUMAN_PROTEOME_PROJECT(
      "Liver (B/D-HPP)", "HLPP (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_PEPIOME_HUMAN_PROTEOME_PROJECT(
      "PediOME (B/D-HPP)", "PediOME (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_PLASMA_HUMAN_PROTEOME_PROJECT(
      "Plasma (B/D-HPP)", "HPPP (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_PROTEIN_MISFOLDING_AGGREGATION_HUMAN_PROTEOME_PROJECT(
      "Protein Misfolding and Aggregation (B/D-HPP)",
      "Protein Misfolding (B/D-HPP)",
      ProjectTagType.PARENT_PROJECT),
  BD_STEM_CELLS_HUMAN_PROTEOME_PROJECT(
      "Stems Cells (B/D-HPP)", "Stems Cells (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  BD_SKELETAL_MUSCLE_HUMAN_PROTEOME_PROJECT(
      "Skeletal Muscle Proteome (B/D-HPP)",
      "Skeletal Muscle Proteome (B/D-HPP)",
      ProjectTagType.PARENT_PROJECT),
  BD_TOXICOPROTEOMICS_HUMAN_PROTEOME_PROJECT(
      "Toxicoproteomics (B/D-HPP)", "Toxicoproteomics (B/D-HPP)", ProjectTagType.PARENT_PROJECT),
  MS_RESOURCE_PILLAR_2018_HUMAN_PROTEOME_PROJECT(
      "MS Resource Pillar 2018 (HUPO-HPP)",
      "HUPO-HPP-MSResourcePillar2018",
      ProjectTagType.PARENT_PROJECT),
  MITOCHONDRIA_HUMAN_PROTEOME_PROJECT(
      "Mitochondria (HPP)", "MTHPPP", ProjectTagType.PARENT_PROJECT),
  CHINA_HUMAN_PROTEOME_PROJECT(
      "China Human Proteome Project (CNHPP)", "CNHPP", ProjectTagType.PARENT_PROJECT);

  private String name;
  private String shortName;
  private ProjectTagType type;

  ProjectTag(String name, String shortName, ProjectTagType type) {
    this.name = name;
    this.shortName = shortName;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public String getShortName() {
    return shortName;
  }

  public ProjectTagType getType() {
    return type;
  }

  public static Collection<String> getProjectTagNames() {
    ArrayList<String> projectTags = new ArrayList<String>();

    for (ProjectTag tag : values()) {
      projectTags.add(tag.getName());
    }

    return projectTags;
  }

  public static Collection<String> getProjectTagShortNames() {
    ArrayList<String> projectTags = new ArrayList<String>();

    for (ProjectTag tag : values()) {
      projectTags.add(tag.getShortName());
    }

    return projectTags;
  }

  public static ProjectTag getProjectTagByName(String name) {
    for (ProjectTag projectTag : ProjectTag.values()) {
      if (projectTag.getName().equalsIgnoreCase(name)) {
        return projectTag;
      }
    }

    return null;
  }

  public static ProjectTag getProjectTagByShortName(String name) {
    for (ProjectTag projectTag : ProjectTag.values()) {
      if (projectTag.getShortName().equalsIgnoreCase(name)) {
        return projectTag;
      }
    }

    return null;
  }

  public static Collection<ProjectTag> getProjectTagsByType(ProjectTagType type) {
    Collection<ProjectTag> typedProjectTags = new LinkedHashSet<ProjectTag>();

    for (ProjectTag projectTag : ProjectTag.values()) {
      if (projectTag.getType().equals(type)) {
        typedProjectTags.add(projectTag);
      }
    }

    return typedProjectTags;
  }
}
