package defpackage;

import android.app.Application;
import android.content.Context;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.spec.ECPoint;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pq8  reason: default package */
/* loaded from: classes.dex */
public final class pq8 implements m8b, hu1, ace, s5f, ym3, k3f, ukf {
    public final /* synthetic */ int a;
    public static final /* synthetic */ pq8 b = new pq8(10);
    public static final /* synthetic */ pq8 c = new pq8(11);
    public static final /* synthetic */ pq8 d = new pq8(12);
    public static final /* synthetic */ pq8 e = new pq8(13);
    public static final /* synthetic */ pq8 f = new pq8(15);
    public static final /* synthetic */ pq8 C = new pq8(16);
    public static final /* synthetic */ pq8 D = new pq8(17);
    public static final /* synthetic */ pq8 E = new pq8(18);
    public static final /* synthetic */ pq8 F = new pq8(19);
    public static final /* synthetic */ pq8 G = new pq8(20);

    public /* synthetic */ pq8(int i) {
        this.a = i;
    }

    public static final r1e d(Object obj, Object obj2) {
        r1e r1eVar = (r1e) obj;
        r1e r1eVar2 = (r1e) obj2;
        if (!r1eVar2.isEmpty()) {
            if (!r1eVar.a) {
                r1eVar = r1eVar.a();
            }
            r1eVar.c();
            if (!r1eVar2.isEmpty()) {
                r1eVar.putAll(r1eVar2);
            }
        }
        return r1eVar;
    }

    @Override // defpackage.ukf
    public /* synthetic */ Object a(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }

    @Override // defpackage.ym3
    public c4 b(Context context, String str, xm3 xm3Var) {
        int i = -1;
        switch (this.a) {
            case 23:
                c4 c4Var = new c4();
                int f2 = xm3Var.f(context, str);
                c4Var.a = f2;
                if (f2 != 0) {
                    c4Var.c = -1;
                } else {
                    int d2 = xm3Var.d(context, str, true);
                    c4Var.b = d2;
                    if (d2 != 0) {
                        c4Var.c = 1;
                    }
                }
                return c4Var;
            default:
                c4 c4Var2 = new c4();
                c4Var2.a = xm3Var.f(context, str);
                int d3 = xm3Var.d(context, str, true);
                c4Var2.b = d3;
                int i2 = c4Var2.a;
                if (i2 == 0) {
                    i2 = 0;
                    if (d3 == 0) {
                        i = 0;
                        c4Var2.c = i;
                        return c4Var2;
                    }
                }
                if (i2 < d3) {
                    i = 1;
                }
                c4Var2.c = i;
                return c4Var2;
        }
    }

    @Override // defpackage.m8b
    public boolean c(vq4 vq4Var) {
        return false;
    }

    @Override // defpackage.m8b
    public o8b f(vq4 vq4Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.s5f
    public bfe g(s6f s6fVar) {
        switch (this.a) {
            case 21:
                ogf ogfVar = (ogf) s6fVar.b;
                if (ogfVar.B().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    try {
                        return xle.a(aif.u(ogfVar.A(), g7e.a), ogfVar.z());
                    } catch (w7e e2) {
                        throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                    }
                }
                vs.m(s21.m("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", ogfVar.B()));
                return null;
            case 24:
                ogf ogfVar2 = (ogf) s6fVar.b;
                if (ogfVar2.B().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        cdf.t(ogfVar2.A(), g7e.a);
                        return new dke(vre.a(ogfVar2.z()));
                    } catch (w7e e3) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e3);
                    }
                }
                vs.m(s21.m("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", ogfVar2.B()));
                return null;
            default:
                ogf ogfVar3 = (ogf) s6fVar.b;
                if (ogfVar3.B().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    try {
                        return rye.a(ogfVar3.z(), jff.t(ogfVar3.A(), g7e.a).w());
                    } catch (w7e e4) {
                        throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e4);
                    }
                }
                vs.m(s21.m("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ", ogfVar3.B()));
                return null;
        }
    }

    @Override // defpackage.m8b
    public int h(vq4 vq4Var) {
        return 1;
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        switch (this.a) {
            case 8:
                return new Object();
            case 14:
                return new wy3(yvVar.c(wc7.class));
            default:
                uc7 uc7Var = (uc7) yvVar.a(uc7.class);
                synchronized (uaf.class) {
                    Object obj = new Object();
                    synchronized (uaf.class) {
                        if (uaf.a == null) {
                            uaf.a = new o0f(1);
                        }
                        z9f z9fVar = (z9f) uaf.a.u(obj);
                    }
                    return new cne(0);
                }
                return new cne(0);
        }
    }

    @Override // defpackage.k3f
    public s9e n(t6f t6fVar) {
        switch (this.a) {
            case 27:
                String str = (String) t6fVar.c;
                Integer num = (Integer) t6fVar.C;
                if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    try {
                        pdf u = pdf.u((s6e) t6fVar.e, g7e.a);
                        if (u.t() == 0) {
                            sdf z = u.z();
                            if (z.t() == 0) {
                                yxe b2 = n0f.b((eif) t6fVar.f, z.y());
                                if (b2.a.equals(uxe.e)) {
                                    return cye.G(mye.F(b2, hlf.a(z.C().m()), num), new xk9(hlf.a(u.A().m()), 26));
                                }
                                return cye.F(mye.E(b2, new ECPoint(ade.C(z.C().m()), ade.C(z.D().m())), num), new g99(ade.C(u.A().m()), 27));
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (IllegalArgumentException | w7e unused) {
                        hfd.j("Parsing EcdsaPrivateKey failed");
                        return null;
                    }
                }
                vs.m(s21.m("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ", str));
                return null;
            default:
                if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        caf u2 = caf.u((s6e) t6fVar.e, g7e.a);
                        if (u2.t() == 0) {
                            jje b3 = o7f.b();
                            b3.h(u2.z().b());
                            b3.j(u2.y().t());
                            b3.c = t8f.a((eif) t6fVar.f);
                            o7f f2 = b3.f();
                            jje jjeVar = new jje(11);
                            jjeVar.c = null;
                            jjeVar.d = null;
                            jjeVar.b = f2;
                            jjeVar.c = new xk9(hlf.a(u2.z().m()), 26);
                            jjeVar.d = (Integer) t6fVar.C;
                            return jjeVar.e();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (IllegalArgumentException | w7e unused2) {
                        hfd.j("Parsing AesCmacKey failed");
                        return null;
                    }
                }
                vs.m("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 7:
                int hashCode = hashCode();
                nqe.u(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return hl5.o("CreationExtras.Key@", num, "<", cm9.a(Application.class).g(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ace
    /* renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 10:
                k4e k4eVar = (k4e) c4e.b.a.a;
                return new Boolean(((Boolean) k4e.b.get()).booleanValue());
            case 11:
                List list = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.max_error_events_per_day", 1000L, 69).get()).longValue());
            case 12:
                List list2 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.monitoring.sample_period_millis", 86400000L, 29).get();
            case 13:
                List list3 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.sgtm.batch.long_queuing_threshold", 240000L, 40).get();
            case 14:
            default:
                List list4 = yme.a;
                j6e j6eVar = (j6e) h6e.b.a.a;
                return (Boolean) j6e.a.get();
            case 15:
                List list5 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.service_client.idle_disconnect_millis", 5000L, 36).get();
            case 16:
                List list6 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.max_event_parameter_value_length", 500L, 19).get()).longValue());
            case 17:
                List list7 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.session.engagement_interval", 3600000L, 12).get();
            case 18:
                List list8 = yme.a;
                p3e.b.get();
                return (Boolean) t3e.a.A(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get();
            case 19:
                List list9 = yme.a;
                t6e t6eVar = (t6e) r6e.b.a.a;
                return (Boolean) t6e.a.get();
        }
    }
}
