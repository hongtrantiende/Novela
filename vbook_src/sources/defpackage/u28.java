package defpackage;

import android.os.Bundle;
import java.security.GeneralSecurityException;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u28  reason: default package */
/* loaded from: classes.dex */
public final class u28 implements v82, rx8, vha, kra, jf5, ace, k3f, x5f, c2f {
    public final /* synthetic */ int a;
    public static final /* synthetic */ u28 b = new u28(11);
    public static final /* synthetic */ u28 c = new u28(12);
    public static final /* synthetic */ u28 d = new u28(13);
    public static final /* synthetic */ u28 e = new u28(14);
    public static final /* synthetic */ u28 f = new u28(15);
    public static final /* synthetic */ u28 C = new u28(16);
    public static final /* synthetic */ u28 D = new u28(17);
    public static final /* synthetic */ u28 E = new u28(18);
    public static final /* synthetic */ u28 F = new u28(19);
    public static final /* synthetic */ u28 G = new u28(20);
    public static final /* synthetic */ u28 H = new u28(21);

    public /* synthetic */ u28(int i) {
        this.a = i;
    }

    @Override // defpackage.c2f
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return ese.w(bArr, bArr2);
    }

    @Override // defpackage.vha
    public sj4 b(s7b s7bVar) {
        return new s02(s7bVar, 7);
    }

    @Override // defpackage.x5f
    public s6f c(bfe bfeVar) {
        eif eifVar;
        switch (this.a) {
            case 23:
                bie bieVar = (bie) bfeVar;
                mgf t = ogf.t();
                t.f("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                waf t2 = zaf.t();
                jbf w = kbf.w();
                mbf v = nbf.v();
                int i = bieVar.c;
                v.c();
                nbf.u((nbf) v.b, i);
                w.c();
                kbf.v((kbf) w.b, (nbf) v.b());
                int i2 = bieVar.a;
                w.c();
                kbf.u((kbf) w.b, i2);
                t2.c();
                zaf.v((zaf) t2.b, (kbf) w.b());
                oef y = pef.y();
                vef d2 = noe.d(bieVar);
                y.c();
                pef.w((pef) y.b, d2);
                int i3 = bieVar.b;
                y.c();
                pef.v((pef) y.b, i3);
                t2.c();
                zaf.w((zaf) t2.b, (pef) y.b());
                t.g(((zaf) t2.b()).b());
                t.e(noe.c(bieVar.e));
                return s6f.Q((ogf) t.b());
            default:
                rne rneVar = (rne) bfeVar;
                mgf t3 = ogf.t();
                t3.f("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                oif w2 = qif.w();
                tif v2 = uif.v();
                int i4 = rneVar.b;
                v2.c();
                uif.u((uif) v2.b, i4);
                w2.c();
                qif.v((qif) w2.b, (uif) v2.b());
                t3.g(((qif) w2.b()).b());
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
                t3.e(eifVar);
                return s6f.Q((ogf) t3.b());
        }
    }

    @Override // defpackage.jf5
    public void d(Object obj, re5 re5Var) {
        igd igdVar = (igd) obj;
        igdVar.getClass();
        re5Var.getClass();
        boolean contains = re5Var.a.f.contains(dgd.a);
        re5Var.d.g(ah5.m, new ggd(null, igdVar, contains));
        re5Var.e.g(ah5.q, new hgd(null, igdVar, contains));
    }

    @Override // defpackage.jf5
    public Object f(xt4 xt4Var) {
        mz6 mz6Var = new mz6(3);
        xt4Var.invoke(mz6Var);
        return new igd(mz6Var.a, (fz0) mz6Var.b, (agd) mz6Var.c);
    }

    @Override // defpackage.jf5
    public h40 getKey() {
        return igd.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b A[RETURN] */
    @Override // defpackage.kra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            lsb r4 = (defpackage.lsb) r4
            lsb r5 = (defpackage.lsb) r5
            r3 = 0
            r0 = 1
            if (r4 == 0) goto L2d
            if (r5 == 0) goto L2d
            mkc r1 = r4.a
            mkc r2 = r5.a
            if (r1 != r2) goto L3b
            oyb r1 = r4.b
            oyb r2 = r5.b
            boolean r1 = defpackage.c16.i(r1, r2)
            if (r1 == 0) goto L3b
            boolean r1 = r4.c
            boolean r2 = r5.c
            if (r1 != r2) goto L3b
            boolean r1 = r4.d
            boolean r2 = r5.d
            if (r1 != r2) goto L3b
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 != r5) goto L3b
            goto L3a
        L2d:
            if (r4 != 0) goto L31
            r4 = r0
            goto L32
        L31:
            r4 = r3
        L32:
            if (r5 != 0) goto L36
            r5 = r0
            goto L37
        L36:
            r5 = r3
        L37:
            r4 = r4 ^ r5
            if (r4 != 0) goto L3b
        L3a:
            return r0
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u28.i(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // defpackage.k3f
    public s9e n(t6f t6fVar) {
        switch (this.a) {
            case 22:
                if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    try {
                        shf u = shf.u((s6e) t6fVar.e, g7e.a);
                        if (u.t() == 0) {
                            return rle.E(xle.a(u.x(), (eif) t6fVar.f), (Integer) t6fVar.C);
                        }
                        throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(u)));
                    } catch (w7e e2) {
                        throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                    }
                }
                vs.m("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                return null;
            case 23:
            case 25:
            default:
                if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        jef u2 = jef.u((s6e) t6fVar.e, g7e.a);
                        if (u2.t() == 0) {
                            odd b2 = h8f.b();
                            b2.b = Integer.valueOf(u2.A().b());
                            b2.c = Integer.valueOf(u2.z().t());
                            b2.d = (g8f) a9f.b.t(u2.z().w());
                            b2.e = (f8f) a9f.a.t((eif) t6fVar.f);
                            h8f j = b2.j();
                            jje jjeVar = new jje(13);
                            jjeVar.c = null;
                            jjeVar.d = null;
                            jjeVar.b = j;
                            jjeVar.c = new xk9(hlf.a(u2.A().m()), 26);
                            jjeVar.d = (Integer) t6fVar.C;
                            return jjeVar.g();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (IllegalArgumentException | w7e unused) {
                        hfd.j("Parsing HmacKey failed");
                        return null;
                    }
                }
                vs.m("Wrong type URL in call to HmacProtoSerialization.parseKey");
                return null;
            case 24:
                if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        ccf u3 = ccf.u((s6e) t6fVar.e, g7e.a);
                        if (u3.t() == 0) {
                            odd b3 = gje.b();
                            b3.t(u3.x().b());
                            b3.l();
                            b3.x();
                            b3.e = vpe.a((eif) t6fVar.f);
                            gje h = b3.h();
                            yx9 yx9Var = new yx9((char) 0, 28);
                            yx9Var.c = null;
                            yx9Var.d = null;
                            yx9Var.b = h;
                            yx9Var.c = new xk9(hlf.a(u3.x().m()), 26);
                            yx9Var.d = (Integer) t6fVar.C;
                            return yx9Var.q();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (w7e unused2) {
                        hfd.j("Parsing AesGcmKey failed");
                        return null;
                    }
                }
                vs.m("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                return null;
            case 26:
                if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    try {
                        scf u4 = scf.u((s6e) t6fVar.e, g7e.a);
                        if (u4.t() == 0) {
                            hvc b4 = lwe.b();
                            b4.C(u4.x().b());
                            b4.c = exe.a((eif) t6fVar.f);
                            lwe y = b4.y();
                            jje jjeVar2 = new jje(4);
                            jjeVar2.c = null;
                            jjeVar2.d = null;
                            jjeVar2.b = y;
                            jjeVar2.c = new xk9(hlf.a(u4.x().m()), 26);
                            jjeVar2.d = (Integer) t6fVar.C;
                            return jjeVar2.d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (w7e unused3) {
                        hfd.j("Parsing AesSivKey failed");
                        return null;
                    }
                }
                vs.m("Wrong type URL in call to AesSivParameters.parseParameters");
                return null;
            case 27:
                String str = (String) t6fVar.c;
                if (str.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    try {
                        xff u5 = xff.u((s6e) t6fVar.e, g7e.a);
                        if (u5.t() == 0) {
                            cgf z = u5.z();
                            if (z.t() == 0) {
                                kye a = rye.a((eif) t6fVar.f, z.y());
                                hye hyeVar = a.a;
                                return oye.E(yye.E(a, rye.c(hyeVar, z.B().m()), (Integer) t6fVar.C), new xk9(hlf.a(ade.E(ade.C(u5.A().m()), t1f.a(hyeVar))), 26));
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (w7e unused4) {
                        hfd.j("Parsing HpkePrivateKey failed");
                        return null;
                    }
                }
                vs.m(s21.m("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ", str));
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                int hashCode = hashCode();
                nqe.u(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return hl5.o("CreationExtras.Key@", num, "<", cm9.a(Bundle.class).g(), ">");
            case 4:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ace
    /* renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                c5e c5eVar = (c5e) b5e.b.a.a;
                return new Boolean(((Boolean) c5e.a.get()).booleanValue());
            case 12:
                List list = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.max_realtime_events_per_day", 10L, 74).get()).longValue());
            case 13:
                List list2 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.sgtm.batch.retry_interval", 1800000L, 41).get();
            case 14:
                List list3 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.window_interval", 3600000L, 79).get();
            case 15:
                List list4 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.config.url_scheme", "https", 8).get();
            case 16:
                List list5 = yme.a;
                o5e.b.get();
                return (String) p5e.a.O("measurement.test.string_flag", "---", 5).get();
            case 17:
                List list6 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.redaction.app_instance_id.ttl", 7200000L, 62).get();
            case 18:
                List list7 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.rb.attribution.event_params", "value|currency", 13).get();
            case 19:
                List list8 = yme.a;
                p3e.b.get();
                return (Boolean) t3e.a.A(10, "measurement.config.default_flag_values", true).get();
            case 20:
                List list9 = yme.a;
                a4e a4eVar = (a4e) v3e.b.a.a;
                return Integer.valueOf((int) ((Long) a4e.a.get()).longValue());
            default:
                List list10 = yme.a;
                q5e.b.get();
                return (Boolean) r5e.a.A(1, "measurement.rb.attribution.client2", true).get();
        }
    }

    @Override // defpackage.v82
    public Object j(u82 u82Var) {
        throw u82Var;
    }
}
