package defpackage;

import android.util.Log;
import java.io.File;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fn8  reason: default package */
/* loaded from: classes.dex */
public final class fn8 implements z69, eea, ace, s5f, q3f, x5f, k3f {
    public static fn8 b;
    public static fn8 c;
    public final /* synthetic */ int a;
    public static final /* synthetic */ fn8 d = new fn8(12);
    public static final /* synthetic */ fn8 e = new fn8(13);
    public static final /* synthetic */ fn8 f = new fn8(14);
    public static final /* synthetic */ fn8 C = new fn8(15);
    public static final /* synthetic */ fn8 D = new fn8(16);
    public static final /* synthetic */ fn8 E = new fn8(17);
    public static final /* synthetic */ fn8 F = new fn8(18);
    public static final /* synthetic */ fn8 G = new fn8(19);
    public static final /* synthetic */ fn8 H = new fn8(22);

    public /* synthetic */ fn8(int i) {
        this.a = i;
    }

    public static final boolean a(hn8 hn8Var) {
        hn8 hn8Var2 = xq9.f;
        return !r4b.I(hn8Var.b(), ".class", true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [my0, java.lang.Object] */
    public static hn8 d(String str, boolean z) {
        str.getClass();
        e31 e31Var = e.a;
        ?? obj = new Object();
        obj.q1(str);
        return e.d(obj, z);
    }

    public static hn8 e(File file) {
        String str = hn8.b;
        String file2 = file.toString();
        file2.getClass();
        return d(file2, false);
    }

    public static hn8 h(hn8 hn8Var, hn8 hn8Var2) {
        hn8Var.getClass();
        hn8Var2.getClass();
        String t = hn8Var2.a.t();
        hn8 hn8Var3 = xq9.f;
        String replace = k4b.t0(hn8Var.a.t(), t).replace('\\', '/');
        replace.getClass();
        return hn8Var3.e(replace);
    }

    public static final f1e j(Object obj, long j) {
        int i;
        f1e f1eVar = (f1e) e3e.i(obj, j);
        if (!((jzd) f1eVar).a) {
            int size = f1eVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            f1e zzg = f1eVar.zzg(i);
            e3e.j(obj, j, zzg);
            return zzg;
        }
        return f1eVar;
    }

    public static final CharSequence m(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    @Override // defpackage.eea
    public zda b(mp8 mp8Var, JSONObject jSONObject) {
        r95 r95Var;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            r95Var = new r95(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 6);
        } else {
            r95Var = new r95(new JSONObject().optInt("max_custom_exception_events", 8), 6);
        }
        r95 r95Var2 = r95Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        i50 i50Var = new i50(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new zda(currentTimeMillis, r95Var2, i50Var, optDouble, optDouble2, optInt2);
    }

    @Override // defpackage.x5f
    public s6f c(bfe bfeVar) {
        switch (this.a) {
            case 24:
                mgf t = ogf.t();
                t.f("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                t.g(cdf.u().b());
                t.e(vre.b(((dke) bfeVar).a));
                return s6f.Q((ogf) t.b());
            default:
                kye kyeVar = (kye) bfeVar;
                mgf t2 = ogf.t();
                t2.f("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
                iff v = jff.v();
                qff d2 = rye.d(kyeVar);
                v.c();
                jff.u((jff) v.b, d2);
                t2.g(((jff) v.b()).b());
                t2.e((eif) rye.g.r(kyeVar.d));
                return s6f.Q((ogf) t2.b());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(defpackage.v20 r5, boolean r6, java.lang.String r7, defpackage.n42 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.ypd
            if (r0 == 0) goto L13
            r0 = r8
            ypd r0 = (defpackage.ypd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ypd r0 = new ypd
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.b
            int r8 = r0.d
            r1 = 1
            if (r8 == 0) goto L2e
            if (r8 != r1) goto L27
            aqd r5 = r0.a
            defpackage.hre.r(r4)
            return r5
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r4)
            aqd r4 = new aqd
            r4.<init>(r5, r6, r7)
            r0.a = r4
            r0.d = r1
            java.lang.Object r5 = defpackage.aqd.a(r4, r0)
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L43
            return r6
        L43:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn8.f(v20, boolean, java.lang.String, n42):java.lang.Object");
    }

    @Override // defpackage.s5f
    public bfe g(s6f s6fVar) {
        ogf ogfVar = (ogf) s6fVar.b;
        if (ogfVar.B().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return new ske(nhf.u(ogfVar.A(), g7e.a).x(), cle.a(ogfVar.z()));
            } catch (w7e e2) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
            }
        }
        vs.m(s21.m("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", ogfVar.B()));
        return null;
    }

    @Override // defpackage.z69
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.q3f
    public t6f k(s9e s9eVar) {
        eif eifVar;
        switch (this.a) {
            case 21:
                rle rleVar = (rle) s9eVar;
                rhf w = shf.w();
                aif b2 = xle.b(rleVar.f);
                w.c();
                shf.v((shf) w.b, b2);
                w6e b3 = ((shf) w.b()).b();
                fje fjeVar = rleVar.f.a;
                if (fje.f != fjeVar) {
                    if (fje.C == fjeVar) {
                        eifVar = eif.RAW;
                    } else {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(fjeVar)));
                    }
                } else {
                    eifVar = eif.TINK;
                }
                return t6f.p("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", b3, 5, eifVar, rleVar.h);
            case 23:
                eie eieVar = (eie) s9eVar;
                qbf x = rbf.x();
                ybf c2 = epe.c(eieVar.f);
                x.c();
                rbf.w((rbf) x.b, c2);
                byte[] b4 = ((hlf) eieVar.g.b).b();
                w6e e2 = s6e.e(b4, 0, b4.length);
                x.c();
                rbf.v((rbf) x.b, e2);
                return t6f.p("type.googleapis.com/google.crypto.tink.AesEaxKey", ((rbf) x.b()).b(), 2, epe.b(eieVar.f.d), eieVar.i);
            case 27:
                cye cyeVar = (cye) s9eVar;
                odf y = pdf.y();
                y.c();
                pdf.v((pdf) y.b);
                sdf c3 = n0f.c(cyeVar.f);
                y.c();
                pdf.x((pdf) y.b, c3);
                yxe yxeVar = cyeVar.f.f;
                if (yxeVar.a.equals(uxe.e)) {
                    byte[] b5 = ((hlf) cyeVar.h.b).b();
                    w6e e3 = s6e.e(b5, 0, b5.length);
                    y.c();
                    pdf.w((pdf) y.b, e3);
                } else {
                    byte[] E2 = ade.E((BigInteger) cyeVar.g.b, n0f.a(yxeVar.a));
                    w6e e4 = s6e.e(E2, 0, E2.length);
                    y.c();
                    pdf.w((pdf) y.b, e4);
                }
                return t6f.p("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((pdf) y.b()).b(), 3, (eif) n0f.g.r(yxeVar.d), cyeVar.C());
            default:
                j7f j7fVar = (j7f) s9eVar;
                baf x2 = caf.x();
                o7f o7fVar = j7fVar.f;
                maf v = oaf.v();
                int i = o7fVar.b;
                v.c();
                oaf.u((oaf) v.b, i);
                x2.c();
                caf.w((caf) x2.b, (oaf) v.b());
                byte[] b6 = ((hlf) j7fVar.g.b).b();
                w6e e5 = s6e.e(b6, 0, b6.length);
                x2.c();
                caf.v((caf) x2.b, e5);
                return t6f.p("type.googleapis.com/google.crypto.tink.AesCmacKey", ((caf) x2.b()).b(), 2, t8f.b(j7fVar.f.c), j7fVar.h);
        }
    }

    @Override // defpackage.z69
    public void l(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // defpackage.k3f
    public s9e n(t6f t6fVar) {
        if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zif u = zif.u((s6e) t6fVar.e, g7e.a);
                if (u.t() == 0) {
                    return boe.E(pue.a((eif) t6fVar.f), new xk9(hlf.a(u.x().m()), 26), (Integer) t6fVar.C);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (w7e unused) {
                hfd.j("Parsing XChaCha20Poly1305Key failed");
                return null;
            }
        }
        vs.m("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        return null;
    }

    @Override // defpackage.ace
    /* renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 12:
                List list = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504", 45).get();
            case 13:
                List list2 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, 49).get();
            case 14:
                List list3 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.stale_data_deletion_interval", 86400000L, 53).get();
            case 15:
                List list4 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.lifetimevalue.max_currency_tracked", 4L, 17).get()).longValue());
            case 16:
                List list5 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.experiment.max_ids", 50L, 21).get()).longValue());
            case 17:
                List list6 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.rb.attribution.uri_authority", "google-analytics.com", 56).get();
            case 18:
                List list7 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L, 25).get()).longValue());
            case 19:
                List list8 = yme.a;
                i5e i5eVar = (i5e) f5e.b.a.a;
                return (Boolean) i5e.a.get();
            default:
                b6e b6eVar = (b6e) z5e.b.a.a;
                return new Boolean(((Boolean) b6e.a.get()).booleanValue());
        }
    }
}
