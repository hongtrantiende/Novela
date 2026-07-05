package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qze  reason: default package */
/* loaded from: classes.dex */
public abstract class qze {
    public static final ogf a;

    static {
        byte[] bArr = new byte[0];
        ogf ogfVar = che.a;
        fdf fdfVar = fdf.UNCOMPRESSED;
        eif eifVar = eif.TINK;
        a = a(fdfVar, ogfVar, eifVar, bArr);
        a(fdf.COMPRESSED, ogfVar, eif.RAW, bArr);
        a(fdfVar, che.c, eifVar, bArr);
    }

    public static ogf a(fdf fdfVar, ogf ogfVar, eif eifVar, byte[] bArr) {
        hdf t = idf.t();
        xdf t2 = zdf.t();
        t2.c();
        ((zdf) t2.b).zze = def.NIST_P256.zza();
        t2.c();
        ((zdf) t2.b).zzf = lef.SHA256.zza();
        w6e e = s6e.e(bArr, 0, bArr.length);
        t2.c();
        zdf.u((zdf) t2.b, e);
        ddf t3 = edf.t();
        t3.c();
        edf.u((edf) t3.b, ogfVar);
        kdf y = mdf.y();
        y.c();
        mdf.w((mdf) y.b, (zdf) t2.b());
        y.c();
        mdf.u((mdf) y.b, (edf) t3.b());
        y.c();
        ((mdf) y.b).zzh = fdfVar.zza();
        t.c();
        idf.v((idf) t.b, (mdf) y.b());
        mgf t4 = ogf.t();
        i6f i6fVar = pxe.a;
        t4.f("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        t4.e(eifVar);
        t4.g(((idf) t.b()).b());
        return (ogf) t4.b();
    }
}
