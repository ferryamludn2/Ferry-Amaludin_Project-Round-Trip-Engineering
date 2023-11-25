import java.util.Vector;

public class absensi {
	private int _iD;
	private Pegawai _pegawai;
	private String _keadaan;
	public Vector<pegawai> _pgw = new Vector<pegawai>();
	public hadir _hdr;
	public sakit _skt;
	public izin _izin;

	public String getKeadaan() {
		return this._keadaan;
	}

	public void setKeadaan(String aKeadaan) {
		this._keadaan = aKeadaan;
	}

	public Pegawai getPegawai() {
		return this._pegawai;
	}

	public void setPegawai(Pegawai aPegawai) {
		this._pegawai = aPegawai;
	}
}