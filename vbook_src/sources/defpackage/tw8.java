package defpackage;

import android.content.Context;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tw8  reason: default package */
/* loaded from: classes.dex */
public final class tw8 implements gr2, vha, kra, xj1, hu1, b7e, ace, xm3, s5f, x5f, k3f, gce, ukf {
    public final /* synthetic */ int a;
    public static final /* synthetic */ tw8 b = new tw8(9);
    public static final /* synthetic */ tw8 c = new tw8(10);
    public static final /* synthetic */ tw8 d = new tw8(11);
    public static final /* synthetic */ tw8 e = new tw8(12);
    public static final /* synthetic */ tw8 f = new tw8(13);
    public static final /* synthetic */ tw8 C = new tw8(15);
    public static final /* synthetic */ tw8 D = new tw8(16);
    public static final /* synthetic */ tw8 E = new tw8(17);
    public static final /* synthetic */ tw8 F = new tw8(18);
    public static final /* synthetic */ tw8 G = new tw8(20);
    public static final /* synthetic */ tw8 H = new tw8(21);

    public /* synthetic */ tw8(int i) {
        this.a = i;
    }

    @Override // defpackage.ukf
    public /* synthetic */ Object a(String str, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }

    @Override // defpackage.vha
    public sj4 b(s7b s7bVar) {
        return new s02(tha.a, 5);
    }

    @Override // defpackage.x5f
    public s6f c(bfe bfeVar) {
        switch (this.a) {
            case 23:
                gje gjeVar = (gje) bfeVar;
                vpe.c(gjeVar);
                mgf t = ogf.t();
                t.f("type.googleapis.com/google.crypto.tink.AesGcmKey");
                ecf x = fcf.x();
                int i = gjeVar.a;
                x.c();
                fcf.v((fcf) x.b, i);
                t.g(((fcf) x.b()).b());
                t.e(vpe.b(gjeVar.d));
                return s6f.Q((ogf) t.b());
            case 24:
            default:
                h8f h8fVar = (h8f) bfeVar;
                mgf t2 = ogf.t();
                t2.f("type.googleapis.com/google.crypto.tink.HmacKey");
                oef y = pef.y();
                uef x2 = vef.x();
                int i2 = h8fVar.b;
                x2.c();
                vef.u((vef) x2.b, i2);
                x2.c();
                vef.v((vef) x2.b, (lef) a9f.b.r(h8fVar.d));
                y.c();
                pef.w((pef) y.b, (vef) x2.b());
                int i3 = h8fVar.a;
                y.c();
                pef.v((pef) y.b, i3);
                t2.g(((pef) y.b()).b());
                t2.e((eif) a9f.a.r(h8fVar.c));
                return s6f.Q((ogf) t2.b());
            case 25:
                lwe lweVar = (lwe) bfeVar;
                mgf t3 = ogf.t();
                t3.f("type.googleapis.com/google.crypto.tink.AesSivKey");
                vcf x3 = wcf.x();
                int i4 = lweVar.a;
                x3.c();
                wcf.v((wcf) x3.b, i4);
                t3.g(((wcf) x3.b()).b());
                jwe jweVar = lweVar.b;
                Map map = exe.e;
                if (map.containsKey(jweVar)) {
                    t3.e((eif) map.get(jweVar));
                    return s6f.Q((ogf) t3.b());
                }
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(jweVar)));
        }
    }

    @Override // defpackage.xm3
    public int d(Context context, String str, boolean z) {
        return zm3.d(context, str, z);
    }

    @Override // defpackage.gr2
    public byte[] e(byte[] bArr) {
        bArr.getClass();
        return bArr;
    }

    @Override // defpackage.xm3
    public int f(Context context, String str) {
        return zm3.a(context, str);
    }

    @Override // defpackage.s5f
    public bfe g(s6f s6fVar) {
        switch (this.a) {
            case 22:
                ogf ogfVar = (ogf) s6fVar.b;
                if (ogfVar.B().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        zaf u = zaf.u(ogfVar.A(), g7e.a);
                        if (u.y().x() == 0) {
                            yv b2 = bie.b();
                            b2.L(u.x().t());
                            b2.N(u.y().t());
                            b2.Q(u.x().y().t());
                            b2.T(u.y().A().t());
                            b2.e = noe.b(u.y().A().w());
                            b2.f = noe.a(ogfVar.z());
                            return b2.J();
                        }
                        hfd.j("Only version 0 keys are accepted");
                        return null;
                    } catch (w7e e2) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
                    }
                }
                vs.m(s21.m("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", ogfVar.B()));
                return null;
            default:
                ogf ogfVar2 = (ogf) s6fVar.b;
                if (ogfVar2.B().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    try {
                        qif u2 = qif.u(ogfVar2.A(), g7e.a);
                        if (u2.t() == 0) {
                            return rne.b(u2.x().t(), zte.a(ogfVar2.z()));
                        }
                        hfd.j("Only version 0 parameters are accepted");
                        return null;
                    } catch (w7e e3) {
                        throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e3);
                    }
                }
                vs.m(s21.m("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", ogfVar2.B()));
                return null;
        }
    }

    @Override // defpackage.xj1
    public long h() {
        return System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[RETURN] */
    @Override // defpackage.kra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            ksb r4 = (defpackage.ksb) r4
            ksb r5 = (defpackage.ksb) r5
            r3 = 0
            r0 = 1
            if (r4 == 0) goto L35
            if (r5 == 0) goto L35
            float r1 = r4.e
            float r2 = r5.e
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L43
            float r1 = r4.f
            float r2 = r5.f
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L43
            tc6 r1 = r4.b
            tc6 r2 = r5.b
            if (r1 != r2) goto L43
            do4 r1 = r4.c
            do4 r2 = r5.c
            boolean r1 = defpackage.c16.i(r1, r2)
            if (r1 == 0) goto L43
            long r1 = r4.d
            long r4 = r5.d
            boolean r4 = defpackage.x02.c(r1, r4)
            if (r4 == 0) goto L43
            goto L42
        L35:
            if (r4 != 0) goto L39
            r4 = r0
            goto L3a
        L39:
            r4 = r3
        L3a:
            if (r5 != 0) goto L3e
            r5 = r0
            goto L3f
        L3e:
            r5 = r3
        L3f:
            r4 = r4 ^ r5
            if (r4 != 0) goto L43
        L42:
            return r0
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw8.i(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        uc7 uc7Var = (uc7) yvVar.a(uc7.class);
        return new Object();
    }

    @Override // defpackage.b7e
    public /* synthetic */ String k(String str, String str2) {
        return null;
    }

    public Object l(wde wdeVar) {
        s9e a = wdeVar.a();
        if (a instanceof mhe) {
            return fkf.c((mhe) a);
        }
        if (a instanceof rie) {
            rie rieVar = (rie) a;
            gje gjeVar = rieVar.f;
            int i = gjeVar.b;
            int i2 = gjeVar.c;
            if (i == 12) {
                if (i2 == 16) {
                    return new wte(((hlf) rieVar.g.b).b(), rieVar.h);
                }
                throw new GeneralSecurityException(a82.j(i2, "Expected tag Size 16, got "));
            }
            throw new GeneralSecurityException(a82.j(gjeVar.b, "Expected IV Size 12, got "));
        } else if (a instanceof lje) {
            lje ljeVar = (lje) a;
            ro roVar = zue.a;
            mp8 mp8Var = new mp8(25);
            byte[] bArr = sqe.d;
            if (sqe.c(mp8.e())) {
                return new sqe(((hlf) ljeVar.g.b).b(), ljeVar.h.b(), mp8Var);
            }
            vs.k("Cipher does not implement AES GCM SIV.");
            return null;
        } else if (a instanceof eie) {
            eie eieVar = (eie) a;
            ro roVar2 = ojf.e;
            if (eub.d(1)) {
                oie oieVar = eieVar.f;
                if (oieVar.c == 16) {
                    return new ojf(oieVar.b, ((hlf) eieVar.g.b).b(), eieVar.h.b());
                }
                throw new GeneralSecurityException(a82.j(oieVar.c, "AesEaxJce only supports 16 byte tag size, not "));
            }
            hfd.j("Can not use AES-EAX in FIPS-mode.");
            return null;
        } else if (a instanceof vje) {
            vje vjeVar = (vje) a;
            hlf hlfVar = vjeVar.h;
            hlf hlfVar2 = (hlf) vjeVar.g.b;
            try {
                ore.c();
                return new ore(hlfVar2.b(), hlfVar.b(), ore.c().getProvider());
            } catch (GeneralSecurityException unused) {
                return new wte(2, hlfVar2.b(), hlfVar.b());
            }
        } else if (a instanceof boe) {
            boe boeVar = (boe) a;
            hlf hlfVar3 = boeVar.h;
            hlf hlfVar4 = (hlf) boeVar.g.b;
            try {
                ore.c();
                return new lue(hlfVar4.b(), hlfVar3.b(), ore.c().getProvider());
            } catch (GeneralSecurityException unused2) {
                return new wte(3, hlfVar4.b(), hlfVar3.b());
            }
        } else if (a instanceof hne) {
            hne hneVar = (hne) a;
            int i3 = hneVar.f.b;
            if (i3 >= 8 && i3 <= 12) {
                return new cue(((hlf) hneVar.g.b).b(), hneVar.h, i3);
            }
            hfd.j("invalid salt size");
            return null;
        } else {
            throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(a.getClass())));
        }
    }

    @Override // defpackage.k3f
    public s9e n(t6f t6fVar) {
        String str = (String) t6fVar.c;
        if (str.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            try {
                cgf u = cgf.u((s6e) t6fVar.e, g7e.a);
                if (u.t() == 0) {
                    kye a = rye.a((eif) t6fVar.f, u.y());
                    return yye.E(a, rye.c(a.a, u.B().m()), (Integer) t6fVar.C);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (w7e unused) {
                hfd.j("Parsing HpkePublicKey failed");
                return null;
            }
        }
        vs.m(s21.m("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ", str));
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                int hashCode = hashCode();
                nqe.u(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return hl5.o("CreationExtras.Key@", num, "<", cm9.a(sdd.class).g(), ">");
            case 3:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ace
    /* renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 10:
                u4e u4eVar = (u4e) t4e.b.a.a;
                return new Boolean(((Boolean) u4e.a.get()).booleanValue());
            case 11:
                List list = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.max_conversions_per_day", 10000L, 68).get()).longValue());
            case 12:
                List list2 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.sgtm.upload.retry_max_wait", 21600000L, 52).get();
            case 13:
                List list3 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.backoff_period", 43200000L, 63).get();
            case 14:
            case 19:
            default:
                List list4 = yme.a;
                y5e y5eVar = (y5e) w5e.b.a.a;
                return (Boolean) y5e.a.get();
            case 15:
                List list5 = yme.a;
                o5e.b.get();
                return (Boolean) p5e.a.A(0, "measurement.test.boolean_flag", false).get();
            case 16:
                List list6 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.sdk.attribution.cache.ttl", 604800000L, 61).get();
            case 17:
                List list7 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", 80).get();
            case 18:
                List list8 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.rb.attribution.notify_app_delay_millis", 3000L, 30).get()).longValue());
            case 20:
                List list9 = yme.a;
                q5e.b.get();
                return (Boolean) r5e.a.A(6, "measurement.rb.attribution.service", true).get();
        }
    }
}
