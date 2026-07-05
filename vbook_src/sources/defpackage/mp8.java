package defpackage;

import android.os.SystemClock;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.spec.ECPoint;
import java.util.List;
import javax.crypto.Cipher;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mp8  reason: default package */
/* loaded from: classes.dex */
public final class mp8 implements gs6, z1e, ace, s5f, q3f, k3f, ukf {
    public final /* synthetic */ int a;
    public static final /* synthetic */ mp8 b = new mp8(10);
    public static final /* synthetic */ mp8 c = new mp8(11);
    public static final /* synthetic */ mp8 d = new mp8(12);
    public static final /* synthetic */ mp8 e = new mp8(13);
    public static final /* synthetic */ mp8 f = new mp8(14);
    public static final /* synthetic */ mp8 C = new mp8(15);
    public static final /* synthetic */ mp8 D = new mp8(16);
    public static final /* synthetic */ mp8 E = new mp8(17);
    public static final /* synthetic */ mp8 F = new mp8(18);
    public static final /* synthetic */ mp8 G = new mp8(19);
    public static final /* synthetic */ mp8 H = new mp8(20);
    public static final /* synthetic */ mp8 I = new mp8(21);
    public static final /* synthetic */ mp8 J = new mp8(22);

    public /* synthetic */ mp8(int i) {
        this.a = i;
    }

    public static Cipher e() {
        try {
            Cipher cipher = (Cipher) zue.a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e2);
        }
    }

    @Override // defpackage.ukf
    public /* synthetic */ Object a(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }

    @Override // defpackage.gs6
    public void b() {
        synchronized (iwe.b) {
            Object obj = iwe.c;
            synchronized (obj) {
                if (iwe.d) {
                    return;
                }
                long b2 = iwe.b();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    iwe.e = b2;
                    iwe.d = true;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lp8
            if (r0 == 0) goto L13
            r0 = r6
            lp8 r0 = (defpackage.lp8) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lp8 r0 = new lp8
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.b
            int r6 = r0.d
            r1 = 1
            if (r6 == 0) goto L2e
            if (r6 != r1) goto L27
            zg8 r5 = r0.a
            defpackage.hre.r(r4)
            goto L42
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r4)
            zg8 r5 = defpackage.qka.a(r5)
            r0.a = r5
            r0.d = r1
            java.io.Serializable r4 = r5.T0(r0)
            n82 r6 = defpackage.n82.a
            if (r4 != r6) goto L42
            return r6
        L42:
            java.util.List r4 = (java.util.List) r4
            op8 r6 = new op8
            int r4 = r4.size()
            r6.<init>(r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp8.d(java.lang.String, n42):java.lang.Object");
    }

    @Override // defpackage.s5f
    public bfe g(s6f s6fVar) {
        switch (this.a) {
            case 23:
                ogf ogfVar = (ogf) s6fVar.b;
                if (ogfVar.B().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        fcf u = fcf.u(ogfVar.A(), g7e.a);
                        if (u.w() == 0) {
                            odd b2 = gje.b();
                            b2.t(u.t());
                            b2.l();
                            b2.x();
                            b2.e = vpe.a(ogfVar.z());
                            return b2.h();
                        }
                        hfd.j("Only version 0 parameters are accepted");
                        return null;
                    } catch (w7e e2) {
                        throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
                    }
                }
                vs.m(s21.m("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", ogfVar.B()));
                return null;
            default:
                ogf ogfVar2 = (ogf) s6fVar.b;
                if (ogfVar2.B().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        gaf u2 = gaf.u(ogfVar2.A(), g7e.a);
                        jje b3 = o7f.b();
                        b3.h(u2.t());
                        b3.j(u2.y().t());
                        b3.c = t8f.a(ogfVar2.z());
                        return b3.f();
                    } catch (w7e e3) {
                        throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e3);
                    }
                }
                vs.m(s21.m("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", ogfVar2.B()));
                return null;
        }
    }

    @Override // defpackage.q3f
    public t6f k(s9e s9eVar) {
        switch (this.a) {
            case 24:
                vje vjeVar = (vje) s9eVar;
                ycf w = zcf.w();
                byte[] b2 = ((hlf) vjeVar.g.b).b();
                w6e e2 = s6e.e(b2, 0, b2.length);
                w.c();
                zcf.v((zcf) w.b, e2);
                return t6f.p("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zcf) w.b()).b(), 2, vre.b(vjeVar.f.a), vjeVar.i);
            default:
                yye yyeVar = (yye) s9eVar;
                return t6f.p("type.googleapis.com/google.crypto.tink.HpkePublicKey", rye.b(yyeVar).b(), 4, (eif) rye.g.r(yyeVar.f.d), yyeVar.i);
        }
    }

    @Override // defpackage.k3f
    public s9e n(t6f t6fVar) {
        String str = (String) t6fVar.c;
        Integer num = (Integer) t6fVar.C;
        if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            try {
                sdf u = sdf.u((s6e) t6fVar.e, g7e.a);
                if (u.t() == 0) {
                    yxe b2 = n0f.b((eif) t6fVar.f, u.y());
                    if (b2.a.equals(uxe.e)) {
                        if (u.D().b() == 0) {
                            return mye.F(b2, hlf.a(u.C().m()), num);
                        }
                        throw new GeneralSecurityException("Y must be empty for X25519 points");
                    }
                    return mye.E(b2, new ECPoint(ade.C(u.C().m()), ade.C(u.D().m())), num);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (IllegalArgumentException | w7e unused) {
                hfd.j("Parsing EcdsaPublicKey failed");
                return null;
            }
        }
        vs.m(s21.m("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ", str));
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ReusedSlotId";
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
                return new Boolean(((Boolean) k4e.a.get()).booleanValue());
            case 11:
                List list = yme.a;
                s4e s4eVar = (s4e) q4e.b.a.a;
                return (String) s4e.c.get();
            case 12:
                List list2 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.sgtm.upload.retry_interval", 600000L, 51).get();
            case 13:
                List list3 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.sgtm.upload.min_delay_after_background", 600000L, 48).get();
            case 14:
                List list4 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 34).get();
            case 15:
                List list5 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.audience.filter_result_max_count", 200L, 22).get()).longValue());
            case 16:
                List list6 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.max_item_scoped_custom_parameters", 27L, 23).get()).longValue());
            case 17:
                List list7 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", 58).get();
            case 18:
                List list8 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.rb.max_trigger_registrations_per_day", 1000L, 24).get()).longValue());
            case 19:
                List list9 = yme.a;
                q6e q6eVar = (q6e) o6e.b.a.a;
                return (Boolean) q6e.a.get();
            case 20:
                List list10 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.max_events_per_bundle", 1000L, 70).get()).longValue());
            case 21:
                List list11 = yme.a;
                q5e.b.get();
                return (Boolean) r5e.a.A(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get();
            default:
                g6e g6eVar = (g6e) f6e.b.a.a;
                return new Boolean(((Boolean) g6e.a.get()).booleanValue());
        }
    }

    @Override // defpackage.z1e
    public boolean zzb(Class cls) {
        return false;
    }

    @Override // defpackage.z1e
    public k2e zzc(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.gs6
    public void c() {
    }
}
