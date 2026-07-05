package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.List;
import javax.crypto.KeyAgreement;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iv8  reason: default package */
/* loaded from: classes.dex */
public final class iv8 implements kx3, ace, hu1, k3f, ym3, s5f, q3f, Continuation, ukf {
    public final /* synthetic */ int a;
    public static final /* synthetic */ iv8 b = new iv8(8);
    public static final /* synthetic */ iv8 c = new iv8(10);
    public static final /* synthetic */ iv8 d = new iv8(11);
    public static final /* synthetic */ iv8 e = new iv8(13);
    public static final /* synthetic */ iv8 f = new iv8(14);
    public static final /* synthetic */ iv8 C = new iv8(15);
    public static final /* synthetic */ iv8 D = new iv8(16);
    public static final /* synthetic */ iv8 E = new iv8(17);
    public static final /* synthetic */ iv8 F = new iv8(18);
    public static final /* synthetic */ iv8 G = new iv8(21);

    public iv8(ik ikVar) {
        this.a = 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.kkc c(defpackage.grb r19, defpackage.dmb r20, defpackage.r7a r21) {
        /*
            r0 = r20
            r7 = r21
            bz5 r5 = new bz5
            r1 = 2
            r2 = 0
            r5.<init>(r1, r2)
            frb r1 = new frb
            r4 = 0
            r6 = 6
            r3 = 0
            r2 = r19
            r1.<init>(r2, r3, r4, r5, r6)
            d92 r3 = r0.a
            xt4 r4 = r0.b
            yya r6 = r0.c
            long r10 = r0.d
            long r12 = r0.e
            long r14 = r0.f
            long r8 = r0.g
            gpb r0 = r0.h
            gpb r16 = defpackage.gva.a     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L7e
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L7e
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L7e
            r18 = r0
            r16 = r8
            r8 = r1
            r9 = r6
            defpackage.gva.a(r8, r9, r10, r12, r14, r16, r18)     // Catch: java.lang.Throwable -> L38 java.util.concurrent.CancellationException -> L7e
            r1 = r8
            goto L4a
        L38:
            r0 = move-exception
            r1 = r8
            goto L3c
        L3b:
            r0 = move-exception
        L3c:
            d92 r6 = defpackage.d92.a
            if (r3 == r6) goto L7d
            g81 r3 = new g81
            java.lang.String r6 = "spanOutputTransformation"
            r3.<init>(r6, r0)
            defpackage.o28.v(r4, r3)
        L4a:
            kw5 r0 = r1.a()
            java.lang.Object r0 = r0.b
            gw7 r0 = (defpackage.gw7) r0
            int r0 = r0.c
            r3 = 0
            if (r0 != 0) goto L58
            goto L7c
        L58:
            long r8 = r2.e
            long r8 = f(r8, r5, r7)
            fxb r0 = r2.f
            if (r0 == 0) goto L6e
            long r2 = r0.a
            long r2 = f(r2, r5, r7)
            fxb r0 = new fxb
            r0.<init>(r2)
            r3 = r0
        L6e:
            r11 = 4
            r10 = 0
            r6 = r1
            r7 = r8
            r9 = r3
            grb r0 = defpackage.frb.h(r6, r7, r9, r10, r11)
            kkc r3 = new kkc
            r3.<init>(r0, r5)
        L7c:
            return r3
        L7d:
            throw r0
        L7e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv8.c(grb, dmb, r7a):kkc");
    }

    public static final long d(long j, bz5 bz5Var) {
        long a;
        int i = fxb.c;
        long a2 = bz5Var.a((int) (j >> 32), false);
        if (fxb.d(j)) {
            a = a2;
        } else {
            a = bz5Var.a((int) (4294967295L & j), false);
        }
        int min = Math.min(fxb.g(a2), fxb.g(a));
        int max = Math.max(fxb.f(a2), fxb.f(a));
        if (fxb.h(j)) {
            return sze.a(max, min);
        }
        return sze.a(min, max);
    }

    public static ycb e(int i) {
        Object obj;
        qu3 qu3Var = ycb.f;
        qu3Var.getClass();
        b2 b2Var = new b2(qu3Var, 0);
        while (true) {
            if (b2Var.hasNext()) {
                obj = b2Var.next();
                if (((ycb) obj).a == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ycb ycbVar = (ycb) obj;
        if (ycbVar == null) {
            return ycb.c;
        }
        return ycbVar;
    }

    public static long f(long j, bz5 bz5Var, r7a r7aVar) {
        long a;
        eid eidVar;
        long a2;
        int i = fxb.c;
        long a3 = bz5Var.a((int) (j >> 32), true);
        if (fxb.d(j)) {
            a = a3;
        } else {
            a = bz5Var.a((int) (j & 4294967295L), true);
        }
        eid eidVar2 = null;
        if (r7aVar != null) {
            eidVar = r7aVar.a;
        } else {
            eidVar = null;
        }
        if (fxb.d(j)) {
            eidVar2 = eidVar;
        } else if (r7aVar != null) {
            eidVar2 = r7aVar.b;
        }
        if (eidVar != null && !fxb.d(a3)) {
            int ordinal = eidVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    int i2 = (int) (a3 & 4294967295L);
                    a3 = sze.a(i2, i2);
                } else {
                    xk5.o();
                    return 0L;
                }
            } else {
                int i3 = (int) (a3 >> 32);
                a3 = sze.a(i3, i3);
            }
        }
        if (eidVar2 != null && !fxb.d(a)) {
            int ordinal2 = eidVar2.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    int i4 = (int) (a & 4294967295L);
                    a2 = sze.a(i4, i4);
                } else {
                    xk5.o();
                    return 0L;
                }
            } else {
                int i5 = (int) (a >> 32);
                a2 = sze.a(i5, i5);
            }
            a = a2;
        }
        int min = Math.min(fxb.g(a3), fxb.g(a));
        int max = Math.max(fxb.f(a3), fxb.f(a));
        if (fxb.h(j)) {
            return sze.a(max, min);
        }
        return sze.a(min, max);
    }

    @Override // defpackage.ukf
    public /* synthetic */ Object a(String str, Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }

    @Override // defpackage.ym3
    public c4 b(Context context, String str, xm3 xm3Var) {
        c4 c4Var = new c4();
        int d2 = xm3Var.d(context, str, true);
        c4Var.b = d2;
        if (d2 != 0) {
            c4Var.c = 1;
            return c4Var;
        }
        int f2 = xm3Var.f(context, str);
        c4Var.a = f2;
        if (f2 != 0) {
            c4Var.c = -1;
        }
        return c4Var;
    }

    @Override // defpackage.s5f
    public bfe g(s6f s6fVar) {
        switch (this.a) {
            case 25:
                ogf ogfVar = (ogf) s6fVar.b;
                if (ogfVar.B().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    try {
                        wcf u = wcf.u(ogfVar.A(), g7e.a);
                        if (u.w() == 0) {
                            hvc b2 = lwe.b();
                            b2.C(u.t());
                            b2.c = exe.a(ogfVar.z());
                            return b2.y();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (w7e e2) {
                        throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e2);
                    }
                }
                vs.m(s21.m("Wrong type URL in call to AesSivParameters.parseParameters: ", ogfVar.B()));
                return null;
            default:
                ogf ogfVar2 = (ogf) s6fVar.b;
                if (ogfVar2.B().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        pef u2 = pef.u(ogfVar2.A(), g7e.a);
                        if (u2.x() == 0) {
                            odd b3 = h8f.b();
                            b3.b = Integer.valueOf(u2.t());
                            b3.c = Integer.valueOf(u2.A().t());
                            b3.d = (g8f) a9f.b.t(u2.A().w());
                            b3.e = (f8f) a9f.a.t(ogfVar2.z());
                            return b3.j();
                        }
                        throw new GeneralSecurityException(a82.j(u2.x(), "Parsing HmacParameters failed: unknown Version "));
                    } catch (w7e e3) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: ", e3);
                    }
                }
                vs.m(s21.m("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", ogfVar2.B()));
                return null;
        }
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        switch (this.a) {
            case 19:
                pi1 pi1Var = (pi1) yvVar.a(pi1.class);
                return new zj1(0);
            default:
                return new jn9(yvVar.c(cne.class));
        }
    }

    @Override // defpackage.q3f
    public t6f k(s9e s9eVar) {
        oye oyeVar = (oye) s9eVar;
        vff y = xff.y();
        y.c();
        xff.v((xff) y.b);
        cgf b2 = rye.b(oyeVar.f);
        y.c();
        xff.x((xff) y.b, b2);
        byte[] b3 = ((hlf) oyeVar.g.b).b();
        w6e e2 = s6e.e(b3, 0, b3.length);
        y.c();
        xff.w((xff) y.b, e2);
        return t6f.p("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((xff) y.b()).b(), 3, (eif) rye.g.r(oyeVar.f.f.d), oyeVar.C());
    }

    @Override // defpackage.k3f
    public s9e n(t6f t6fVar) {
        switch (this.a) {
            case 20:
                if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    try {
                        fhf u = fhf.u((s6e) t6fVar.e, g7e.a);
                        if (u.t() == 0) {
                            return oke.E(new ske(u.x().x(), cle.a((eif) t6fVar.f)), (Integer) t6fVar.C);
                        }
                        throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(u)));
                    } catch (w7e e2) {
                        throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
                    }
                }
                vs.m("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                return null;
            default:
                if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        zcf u2 = zcf.u((s6e) t6fVar.e, g7e.a);
                        if (u2.t() == 0) {
                            return vje.E(vre.a((eif) t6fVar.f), new xk9(hlf.a(u2.x().m()), 26), (Integer) t6fVar.C);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (w7e unused) {
                        hfd.j("Parsing ChaCha20Poly1305Key failed");
                        return null;
                    }
                }
                vs.m("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                return null;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        rve[] rveVarArr;
        nwe[] nweVarArr;
        o0e d2;
        wve wveVar = (wve) task.getResult();
        j1f z = m1f.z();
        String str = wveVar.a;
        z.b();
        ((m1f) z.b).A(str);
        String str2 = wveVar.c;
        z.b();
        ((m1f) z.b).C(str2);
        boolean z2 = wveVar.f;
        z.b();
        ((m1f) z.b).F(z2);
        long j = wveVar.C;
        z.b();
        ((m1f) z.b).G(j);
        byte[] bArr = wveVar.b;
        if (bArr != null) {
            rzd h = szd.h(bArr, 0, bArr.length);
            z.b();
            ((m1f) z.b).B(h);
        }
        for (rve rveVar : wveVar.d) {
            for (nwe nweVar : rveVar.b) {
                int i = nweVar.C;
                String str3 = nweVar.a;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    n1f z3 = q1f.z();
                                    z3.g(str3);
                                    if (i == 5) {
                                        byte[] bArr2 = nweVar.f;
                                        am8.s(bArr2);
                                        rzd h2 = szd.h(bArr2, 0, bArr2.length);
                                        z3.b();
                                        ((q1f) z3.b).G(h2);
                                        d2 = z3.d();
                                    } else {
                                        vs.m("Not a bytes type");
                                        return null;
                                    }
                                } else {
                                    vs.m(nk2.s(i, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i).length() + 24)));
                                    return null;
                                }
                            } else {
                                n1f z4 = q1f.z();
                                z4.g(str3);
                                if (i == 4) {
                                    String str4 = nweVar.e;
                                    am8.s(str4);
                                    z4.b();
                                    ((q1f) z4.b).F(str4);
                                    d2 = z4.d();
                                } else {
                                    vs.m("Not a String type");
                                    return null;
                                }
                            }
                        } else {
                            n1f z5 = q1f.z();
                            z5.g(str3);
                            if (i == 3) {
                                double d3 = nweVar.d;
                                z5.b();
                                ((q1f) z5.b).E(d3);
                                d2 = z5.d();
                            } else {
                                vs.m("Not a double type");
                                return null;
                            }
                        }
                    } else {
                        n1f z6 = q1f.z();
                        z6.g(str3);
                        if (i == 2) {
                            boolean z7 = nweVar.c;
                            z6.b();
                            ((q1f) z6.b).D(z7);
                            d2 = z6.d();
                        } else {
                            vs.m("Not a boolean type");
                            return null;
                        }
                    }
                } else {
                    n1f z8 = q1f.z();
                    z8.g(str3);
                    if (i == 1) {
                        long j2 = nweVar.b;
                        z8.b();
                        ((q1f) z8.b).C(j2);
                        d2 = z8.d();
                    } else {
                        vs.m("Not a long type");
                        return null;
                    }
                }
                z.b();
                ((m1f) z.b).D((q1f) d2);
            }
            String[] strArr = rveVar.c;
            if (strArr != null) {
                for (String str5 : strArr) {
                    z.b();
                    ((m1f) z.b).E(str5);
                }
            }
        }
        return (m1f) z.d();
    }

    public String toString() {
        switch (this.a) {
            case 2:
                int hashCode = hashCode();
                nqe.u(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return hl5.o("CreationExtras.Key@", num, "<", cm9.a(ty9.class).g(), ">");
            case 7:
                int hashCode2 = hashCode();
                nqe.u(16);
                String num2 = Integer.toString(hashCode2, 16);
                num2.getClass();
                return hl5.o("CreationExtras.Key@", num2, "<", cm9.a(String.class).g(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ace
    /* renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 10:
                o4e o4eVar = (o4e) m4e.b.a.a;
                return new Boolean(((Boolean) o4e.a.get()).booleanValue());
            case 11:
                List list = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.max_public_events_per_day", 50000L, 72).get()).longValue());
            case 12:
            default:
                List list2 = yme.a;
                y5e y5eVar = (y5e) w5e.b.a.a;
                return (Boolean) y5e.b.get();
            case 13:
                List list3 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.config.cache_time", 86400000L, 5).get();
            case 14:
                List list4 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.initial_upload_delay_time", 15000L, 64).get();
            case 15:
                List list5 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.service_client.reconnect_millis", 1000L, 38).get();
            case 16:
                List list6 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.max_bundles_per_iteration", 100L, 3).get()).longValue());
            case 17:
                List list7 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.rb.attribution.app_allowlist", "", 32).get();
            case 18:
                List list8 = yme.a;
                p3e.b.get();
                return (Boolean) t3e.a.A(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get();
        }
    }

    public /* synthetic */ iv8(int i) {
        this.a = i;
    }
}
