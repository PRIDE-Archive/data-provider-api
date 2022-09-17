package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SpectrumNumberArrayDeserializerTest{
    String spectraLine = "{\"usi\":\"mzspec:PRD000902:Rice_leaf_0h_phospho_test1:scan:3817:N[UNIMOD:7]NGSSIGS[UNIMOD:21]PGPGR/2\",\"spectraUsi\":\"mzspec:PXD002222:Rice_leaf_0h_phospho_test1:scan:3817\",\"assayAccession\":\"c0300332f12ec3420b966972b077cdb25520c0ba\",\"projectAccession\":\"PXD002222\",\"reanalysisAccession\":\"PRD000902\",\"proteinAccessions\":[\"Os07t0584500-01\"],\"peptideSequence\":\"NNGSSIGSPGPGR\",\"peptidoform\":\"N[UNIMOD:7]NGSSIGS[UNIMOD:21]PGPGR/2\",\"scores\":[{\"accession\":\"MS:1002257\",\"name\":\"Comet:expectation value\",\"value\":\"2.99E-8\"},{\"accession\":\"MS:1002354\",\"name\":\"PSM-level q-value\",\"value\":\"5.0E-6\"},{\"accession\":\"MS:1002357\",\"name\":\"PSM-level probability\",\"value\":\"1.0\"},{\"accession\":\"MS:1002355\",\"name\":\"PSM-level FDRScore\",\"value\":\"1.2510634038933093E-5\"}],\"sampleProperties\":[{\"accession\":\"EFO:0000324\",\"name\":\"cell type\",\"value\":\"not applicable\"},{\"accession\":\"OBI:0100026\",\"name\":\"organism\",\"value\":\"Oryza sativa\"},{\"accession\":\"EFO:0000635\",\"name\":\"organism part\",\"value\":\"Leaf\"},{\"accession\":\"EFO:0000408\",\"name\":\"disease\",\"value\":\"Xanthomonas oryzae pv. oryzae\"},{\"accession\":\"EFO:0002091\",\"name\":\"biological replicate\",\"value\":\"1\"}],\"isDecoy\":false,\"isValid\":true,\"precursorCharge\":2,\"precursorMz\":640.764810900142,\"bestSearchEngineScore\":{\"accession\":\"MS:1002354\",\"name\":\"PSM-level q-value\",\"value\":\"5.0E-6\"},\"numPeaks\":198,\"masses\":\"eJwllFtsVFUUhjdTi0JjiKiI5bbpxBdiH+TS2MbAYcolaRMCNTFC0Z5OKYp2gCktlpYpZ3pLsBRKJ/AwBjnTC2BJY2wjRAzkMBaMVDBgImGSMYdLjKQBgQolpeXSbz39WXuvy7/W+vdWShlNT+sN9QKbC0A34CnGbpmK7bRG5b7K7x9Hq8K3eRxVMF42jvZmf5C44mW12LF0C+zOAN08z2fYeQu5d1a0bR1HHX+fe5XVVg0mcvZSZ+b8Cvxn+74i/mb7bupO92Ob08p3kOfBujrsGXVf4D/p/xryDGWFyXOvgHtraBp1rDc64et42qvAkSrh9/IocfrRvK/FvsG9kYgXkt8Tp3/9LANezpREA3Ue+kq5H90TkPh+5mI/jpeA/3STx4z7TOp7T1DPWNgL6py78LQWT4Snzp5MXme5R3BlRhP+qxLwMvJypJ9V6Zy7+xuEX9uytfif6a3kvCvOPNz8ieQxYz72YxVkybxWH6Su830/fbsf+bDNI707qVNUXSdYB9r+uMSZtcKz9ALoNrxE38ahcuZifu4T/7IR6W9Lk+TZch50yuaDKuJnProiIXuK3tgAv9Bk0VttUnRS2bGd+52hasEe0NzqZa6qPEX4H07bAx4Iyzw3LkVf6suL9OP4W4izoz+S3/r2h0byBebiZwcuix5zU9YT13kN/uYKr+zN/hD9qaLwNvy7CrGN9hTqGh/3oUuVHxL9rW5EB3pRPfztRX2guSSAbu0LAy3Y/X+Cxm9j0velmMzrfCP7VtnNxLkfeNGt6b0OT+fKJtnXX5ky17+HmrEXn91I/ECgFfv3IGi80yFzessLTzv9E+ah36yhH/NWpeSZUS/22xH2aaQMloMjg+R356V+Cq9XFsi+R08Tp//1bsK+nYvunOGw3Kf+Ck91f6n0kbaNPs3hmOzjXoz5qjklzNH+r0POB/PZm/tkAv+QHg7Lu51Vg+719VzZa/9c/hWdLKE/4+oYujH/uMm71O9G8DcvJ0Ps8WqY+esrE9CfM5BGHv3LrF3wSBb7OV9QCB8dK8G2fhoj3jn1Kn669Rw6cfsyxT61n371mRjvzDnZhz71d4XUM4ty2bO1L5U4ozubc7f5XBH+Pcfln+g8DR+ryyv9H00KHlsj84sE2Y8T7RGdHcoU/8N36FtF7lPfKP1G/odAvui0uEPsg3dCErcGHbnRCP+FFX4PVDte34cdibFHtfs19q/rg/BzG36uMZ4DtkiqlQ==\",\"intensities\":\"eJwllHtMz3sYx7/Nco+Ve23tO8sOM3+g5fzyG9+jhMU5uS2X2Pc4OcOsMJEO85XNLUYZbc6vfJVbV7+Ewo6+1UmcTuYnlzL07WZGpJZx4o/j93r+evZ8nud5P+/n9lEURSlPyNe+C9Vxo9QrtdY119FjjGdeaTSHFKOv3+L2SssnvwA9xVXplbZnMfHK2sRH6N3Dm7AnT77M+7wR4Nnbh3wBb3NCEThNUbnYD8VcxL5vKbjmxgXnsccdvOuV+sSWWuI6vvJuLFwJrhr7C3aruwxe2tQ56GptGna7cl+H5P96CX226xx+peGFxDmyLoD389Zr5J3QCi+l+0/8lSfDsFvluehacC31WW9PuKVeP+zqlB9yJT70vvCOE36fMvGzI9rRDXVDFX6Xwp/g9+2yhZ/lIK+R7CP821rfIkOjpe6yPPpvhmTC01Y/taCn72ReyoNtMofo0+TT6/+ij9byHa/wC9qQA3//sIe8rzhwB3kytY48wZHgmPE1EnfVZ8BPXpwVzjbeXWnUre8wvyF3Ly9BPhxFPvXDO/D1gCp42vHvPNKHIPIpVh7xSoUbXa3OwN+uSrzKe8lKmU/dfPZDTYmROXycQb9UdzF9trv20EfrwS2Zu98smWPfdJlfeIX049Tvgn96Pf7asff0W4115vE+OBCeeuMq8R95QvZtdRR+SmEweEp7xz/I6psv8P/DHzzd7S/z3+JuAC9snPALHwMf5bccpBnpAc9w9ZLXCJhHPuP9SeE/ehB1W13lcg/t99kHLWia7N/QYu7CSveYyIGR8DL2K3Kf9X346Wdc7Il2pScLe3P8Pex1BczTPt9HvdqbtfRF60zl3UhpkP1w3mtErpsmc+339G/kxUHw1tc0Pgcvu1D6tPAA+Sz/X7GrWxfJnR9dBL6V1il+YZvgoSf1UofRlSH7l6AizVkR3KOZUijz/9wj+5DYJHOpSGKPNOd/3Jfhe5a8yt2Of8HxCRG8OzNlzpWOx9ivBb4m78C51KXHyd7by8bLfe3vesq7Y84V4goqaogLrEc3/HzJa28skf+uKKmauNSdveiTXsid3S6Cr5YdxN1rI9uJtwKGNoP3ciZztZccl/sfEyV7ED2YPhmZudLHYWN78G/olHk5jiCVjB+Rutmf/PoeJ/uozj7Mnui+6fTNCM3m/7VutYFnB3j4H/Tkg9Rv9y9jnlZpDfto7x0LHzMijr7oU3ZRv5bVwvy1Y74yzwn9aqRuHd5a8psq7X+A5tWt\",\"msLevel\":2,\"retentionTime\":753.2,\"missedCleavages\":0,\"modifications\":[{\"@type\":\"IdentifiedModification\",\"neutralLoss\":null,\"positionMap\":[{\"key\":1,\"value\":[{\"@type\":\"CvParam\",\"cvLabel\":\"MS\",\"accession\":\"MS:1003147\",\"name\":\"PTMProphet probability\",\"value\":\"0.3333\"}]}],\"modification\":{\"@type\":\"CvParam\",\"cvLabel\":\"UNIMOD\",\"accession\":\"UNIMOD:7\",\"name\":\"Deamidated\",\"value\":\"0.984016\"},\"attributes\":[]},{\"@type\":\"IdentifiedModification\",\"neutralLoss\":null,\"positionMap\":[{\"key\":8,\"value\":[{\"@type\":\"CvParam\",\"cvLabel\":\"MS\",\"accession\":\"MS:1003147\",\"name\":\"PTMProphet probability\",\"value\":\"0.774\"}]}],\"modification\":{\"@type\":\"CvParam\",\"cvLabel\":\"UNIMOD\",\"accession\":\"UNIMOD:21\",\"name\":\"Phospho\",\"value\":\"79.9663\"},\"attributes\":[]}],\"qualityEstimationMethods\":[{\"accession\":\"MS:1001194\",\"name\":\"quality estimation with decoy database\",\"value\":\"true\"}],\"properties\":[{\"accession\":\"PRIDE:0000511\",\"name\":\"Pass submitter threshold\",\"value\":\"true\"}]}";
    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.objectMapper = new ObjectMapper();
    }

    @Test
    public void testDeserialize() {
        try {
            BinaryArchiveSpectrum spectrum = objectMapper.readValue(spectraLine, BinaryArchiveSpectrum.class);
            Assert.assertEquals("mzspec:PRD000902:Rice_leaf_0h_phospho_test1:scan:3817:N[UNIMOD:7]NGSSIGS[UNIMOD:21]PGPGR/2", spectrum.getUsi());

            ArchiveSpectrum nonBinSpec = new ArchiveSpectrum(spectrum);

            String line = objectMapper.writeValueAsString(nonBinSpec);

            System.out.println(line);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}