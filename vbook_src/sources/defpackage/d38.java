package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d38  reason: default package */
/* loaded from: classes.dex */
public final class d38 implements e38, oa4, SuccessContinuation, b8e, ace, hu1, x5f, q3f, s5f, x0f {
    public final /* synthetic */ int a;
    public static final /* synthetic */ d38 b = new d38(9);
    public static final /* synthetic */ d38 c = new d38(11);
    public static final /* synthetic */ d38 d = new d38(13);
    public static final /* synthetic */ d38 e = new d38(14);
    public static final /* synthetic */ d38 f = new d38(15);
    public static final /* synthetic */ d38 C = new d38(16);
    public static final /* synthetic */ d38 D = new d38(17);
    public static final /* synthetic */ d38 E = new d38(18);
    public static final /* synthetic */ d38 F = new d38(19);
    public static final /* synthetic */ d38 G = new d38(20);
    public static final /* synthetic */ d38 H = new d38(22);

    public d38(Context context) {
        this.a = 8;
    }

    public static final void l(d38 d38Var, rcc rccVar, vc1 vc1Var, ifc ifcVar, ifc ifcVar2) {
        d38Var.getClass();
        if (vc1Var.N0()) {
            String G2 = vc1Var.G(-1, new v71(9));
            rccVar.f.k(G2);
            rccVar.i(G2);
            return;
        }
        char C2 = vc1Var.C();
        if (C2 != '\t' && C2 != '\n' && C2 != '\f' && C2 != '\r' && C2 != ' ' && C2 != '/' && C2 != '>') {
            vc1Var.l1();
            rccVar.p(ifcVar2);
            return;
        }
        if (rccVar.f.V().equals("script")) {
            rccVar.p(ifcVar);
        } else {
            rccVar.p(ifcVar2);
        }
        rccVar.g(C2);
    }

    public static final void m(d38 d38Var, rcc rccVar, vc1 vc1Var, ifc ifcVar) {
        d38Var.getClass();
        if (vc1Var.N0()) {
            String G2 = vc1Var.G(-1, new v71(12));
            rccVar.j.R(G2);
            rccVar.f.k(G2);
            return;
        }
        boolean o = rccVar.o();
        s26 s26Var = rccVar.f;
        if (o && !vc1Var.g0()) {
            char C2 = vc1Var.C();
            if (C2 != '\t' && C2 != '\n' && C2 != '\f' && C2 != '\r' && C2 != ' ') {
                if (C2 != '/') {
                    if (C2 != '>') {
                        s26Var.j(C2);
                    } else {
                        rccVar.l();
                        rccVar.p(ifc.d);
                        return;
                    }
                } else {
                    rccVar.p(ifc.o0);
                    return;
                }
            } else {
                rccVar.p(ifc.g0);
                return;
            }
        }
        rccVar.i("</");
        rccVar.i(s26Var.V());
        rccVar.p(ifcVar);
    }

    public static final void n(d38 d38Var, rcc rccVar, ifc ifcVar) {
        String sb;
        d38Var.getClass();
        int[] c2 = rccVar.c(null, false);
        if (c2 == null) {
            rccVar.g('&');
        } else {
            if (c2.length == 0) {
                sb = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i : c2) {
                    sb2.appendCodePoint(i);
                }
                sb = sb2.toString();
            }
            rccVar.i(sb);
        }
        rccVar.p(ifcVar);
    }

    public static final void o(d38 d38Var, rcc rccVar, vc1 vc1Var, ifc ifcVar, ifc ifcVar2) {
        d38Var.getClass();
        char V = vc1Var.V();
        if (V != 0) {
            if (V != '<') {
                if (V != 65535) {
                    rccVar.i(vc1Var.G(-1, new v71(11)));
                    return;
                } else {
                    rccVar.h(new wbc());
                    return;
                }
            }
            rccVar.a(ifcVar2);
            return;
        }
        rccVar.n(ifcVar);
        vc1Var.o();
        rccVar.g((char) 65533);
    }

    public static void p(int i) {
        synchronized (UnmanagedSessionReceiver.a) {
            if (UnmanagedSessionReceiver.b.get(Integer.valueOf(i)) != null) {
                throw new ClassCastException();
            }
        }
    }

    @Override // defpackage.e38
    public boolean a(mq7 mq7Var) {
        return false;
    }

    @Override // defpackage.e38
    public int b() {
        return 8;
    }

    @Override // defpackage.x5f
    public s6f c(bfe bfeVar) {
        eif eifVar;
        ole oleVar = (ole) bfeVar;
        mgf t = ogf.t();
        t.f("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        t.g(xle.b(oleVar).b());
        fje fjeVar = oleVar.a;
        if (fje.f != fjeVar) {
            if (fje.C == fjeVar) {
                eifVar = eif.RAW;
            } else {
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(fjeVar)));
            }
        } else {
            eifVar = eif.TINK;
        }
        t.e(eifVar);
        return s6f.Q((ogf) t.b());
    }

    @Override // defpackage.e38
    public boolean d(mq7 mq7Var) {
        return bue.p(sye.d(voe.v(mq7Var), false));
    }

    @Override // defpackage.e38
    public void e(od6 od6Var, long j, a75 a75Var, int i, boolean z) {
        kn knVar = od6Var.c0;
        qs9 qs9Var = i38.p0;
        ((i38) knVar.e).J1(i38.t0, ((i38) knVar.e).B1(true, j), a75Var, 1, z);
    }

    @Override // defpackage.e38
    public boolean f(a75 a75Var, od6 od6Var) {
        return false;
    }

    @Override // defpackage.s5f
    public bfe g(s6f s6fVar) {
        ogf ogfVar = (ogf) s6fVar.b;
        if (ogfVar.B().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                mcf u = mcf.u(ogfVar.A(), g7e.a);
                if (u.w() == 0) {
                    hvc b2 = sje.b();
                    b2.C(u.t());
                    b2.c = wqe.a(ogfVar.z());
                    return b2.x();
                }
                hfd.j("Only version 0 parameters are accepted");
                return null;
            } catch (w7e e2) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
            }
        }
        vs.m(s21.m("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", ogfVar.B()));
        return null;
    }

    @Override // defpackage.k99
    public Object get() {
        tw8 tw8Var = new tw8(7);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(c69.a, new ed0(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(c69.c, new ed0(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(e0a.b)));
                    if (unmodifiableSet != null) {
                        hashMap.put(c69.b, new ed0(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= c69.values().length) {
                            new HashMap();
                            return new dd0(tw8Var, hashMap);
                        }
                        vs.k("Not all priorities have been configured");
                        return null;
                    }
                    xk5.k("Null flags");
                    return null;
                }
                xk5.k("Null flags");
                return null;
            }
            xk5.k("Null flags");
            return null;
        }
        xk5.k("Null flags");
        return null;
    }

    @Override // defpackage.e38
    public boolean h(od6 od6Var) {
        u7a x = od6Var.x();
        boolean z = false;
        if (x != null && x.d) {
            z = true;
        }
        return !z;
    }

    @Override // defpackage.x0f
    public byte[] i(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        if (bArr.length == 32) {
            try {
                ore.c();
                Provider provider = ore.c().getProvider();
                if (eub.d(1)) {
                    if (bArr.length == 32) {
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
                        if (bArr3 != null) {
                            if (bArr2.length == 12) {
                                if (bArr3.length >= i + 16) {
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                                    Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    if (bArr4.length != 0) {
                                        cipher.updateAAD(bArr4);
                                    }
                                    return cipher.doFinal(bArr3, i, bArr3.length - i);
                                }
                                hfd.j("ciphertext too short");
                                return null;
                            }
                            hfd.j("nonce length must be 12 bytes.");
                            return null;
                        }
                        xk5.k("ciphertext is null");
                        return null;
                    }
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                hfd.j("Can not use ChaCha20Poly1305 in FIPS-mode.");
                return null;
            } catch (GeneralSecurityException unused) {
                return new cte(bArr, 0).h(ByteBuffer.wrap(Arrays.copyOfRange(bArr3, i, bArr3.length)), bArr2, bArr4);
            }
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        switch (this.a) {
            case 12:
                return new kn9(yvVar.b(mf9.a(jn9.class)));
            default:
                return new uga((Context) yvVar.a(Context.class));
        }
    }

    @Override // defpackage.q3f
    public t6f k(s9e s9eVar) {
        eif eifVar;
        switch (this.a) {
            case 23:
                mhe mheVar = (mhe) s9eVar;
                raf x = taf.x();
                dbf w = fbf.w();
                mbf v = nbf.v();
                int i = mheVar.f.c;
                v.c();
                nbf.u((nbf) v.b, i);
                w.c();
                fbf.v((fbf) w.b, (nbf) v.b());
                byte[] b2 = ((hlf) mheVar.g.b).b();
                w6e e2 = s6e.e(b2, 0, b2.length);
                w.c();
                fbf.u((fbf) w.b, e2);
                x.c();
                taf.v((taf) x.b, (fbf) w.b());
                ief x2 = jef.x();
                bie bieVar = mheVar.f;
                vef d2 = noe.d(bieVar);
                x2.c();
                jef.w((jef) x2.b, d2);
                byte[] b3 = ((hlf) mheVar.h.b).b();
                w6e e3 = s6e.e(b3, 0, b3.length);
                x2.c();
                jef.v((jef) x2.b, e3);
                x.c();
                taf.w((taf) x.b, (jef) x2.b());
                return t6f.p("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((taf) x.b()).b(), 2, noe.c(bieVar.e), mheVar.j);
            case 24:
            default:
                uve uveVar = (uve) s9eVar;
                rcf w2 = scf.w();
                byte[] b4 = ((hlf) uveVar.g.b).b();
                w6e e4 = s6e.e(b4, 0, b4.length);
                w2.c();
                scf.v((scf) w2.b, e4);
                w6e b5 = ((scf) w2.b()).b();
                jwe jweVar = uveVar.f.b;
                Map map = exe.e;
                if (map.containsKey(jweVar)) {
                    return t6f.p("type.googleapis.com/google.crypto.tink.AesSivKey", b5, 2, (eif) map.get(jweVar), uveVar.i);
                }
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(jweVar)));
            case 25:
                hne hneVar = (hne) s9eVar;
                jif x3 = kif.x();
                byte[] b6 = ((hlf) hneVar.g.b).b();
                w6e e5 = s6e.e(b6, 0, b6.length);
                x3.c();
                kif.v((kif) x3.b, e5);
                tif v2 = uif.v();
                rne rneVar = hneVar.f;
                int i2 = rneVar.b;
                v2.c();
                uif.u((uif) v2.b, i2);
                x3.c();
                kif.w((kif) x3.b, (uif) v2.b());
                w6e b7 = ((kif) x3.b()).b();
                oce oceVar = rneVar.a;
                if (oceVar != oce.E) {
                    if (oceVar == oce.F) {
                        eifVar = eif.RAW;
                    } else {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(oceVar)));
                    }
                } else {
                    eifVar = eif.TINK;
                }
                return t6f.p("type.googleapis.com/google.crypto.tink.XAesGcmKey", b7, 2, eifVar, hneVar.i);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = kv9.h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    @Override // defpackage.ace
    /* renamed from: zza  reason: collision with other method in class */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                List list = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid", 4).get();
            case 12:
            default:
                List list2 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.ad_id_cache_time", 10000L, 0).get();
            case 13:
                List list3 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.sgtm.batch.retry_max_count", 10L, 42).get()).longValue());
            case 14:
                List list4 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.realtime_upload_interval", 10000L, 33).get();
            case 15:
                List list5 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.retry_time", 1800000L, 77).get();
            case 16:
                List list6 = yme.a;
                o5e.b.get();
                return (Long) p5e.a.K("measurement.test.long_flag", -1L, 4).get();
            case 17:
                List list7 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.rb.attribution.client.min_ad_services_version", 7L, 26).get()).longValue());
            case 18:
                List list8 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.max_batch_size", 65536L, 75).get()).longValue());
            case 19:
                List list9 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.max_bundle_size", 65536L, 66).get()).longValue());
            case 20:
                List list10 = yme.a;
                y4e y4eVar = (y4e) w4e.b.a.a;
                return (Boolean) y4e.a.get();
        }
    }

    @Override // defpackage.b8e
    public boolean zzb(Class cls) {
        return false;
    }

    @Override // defpackage.x0f
    public byte[] zzc() {
        return t1f.k;
    }

    public /* synthetic */ d38(int i) {
        this.a = i;
    }

    @Override // defpackage.x0f
    public int zza() {
        return 32;
    }

    @Override // defpackage.b8e
    public n8e zza(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }
}
