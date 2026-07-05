package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.lang.ref.ReferenceQueue;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jf8  reason: default package */
/* loaded from: classes.dex */
public final class jf8 implements c82, pxa, s5a, xj1, hu1, ace, q3f, x5f, k3f {
    public final /* synthetic */ int a;
    public static final /* synthetic */ jf8 b = new jf8(10);
    public static final /* synthetic */ jf8 c = new jf8(11);
    public static final /* synthetic */ jf8 d = new jf8(12);
    public static final /* synthetic */ jf8 e = new jf8(13);
    public static final /* synthetic */ jf8 f = new jf8(14);
    public static final /* synthetic */ jf8 C = new jf8(15);
    public static final /* synthetic */ jf8 D = new jf8(16);
    public static final /* synthetic */ jf8 E = new jf8(18);
    public static final /* synthetic */ jf8 F = new jf8(19);
    public static final /* synthetic */ jf8 G = new jf8(21);
    public static final /* synthetic */ jf8 H = new jf8(22);

    public jf8(l36 l36Var, mu4 mu4Var) {
        this.a = 3;
    }

    public static final int a(int i) {
        int i2 = i4b.i;
        int i3 = i - 1;
        int i4 = i3 | (i3 >>> 1);
        int i5 = i4 | (i4 >>> 2);
        int i6 = i5 | (i5 >>> 4);
        int i7 = i6 | (i6 >>> 8);
        int i8 = i7 | (i7 >>> 16);
        if (i8 < 4) {
            return 4;
        }
        return i8 + 1;
    }

    public static final boolean b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.x5f
    public s6f c(bfe bfeVar) {
        oie oieVar = (oie) bfeVar;
        mgf t = ogf.t();
        t.f("type.googleapis.com/google.crypto.tink.AesEaxKey");
        tbf x = ubf.x();
        ybf c2 = epe.c(oieVar);
        x.c();
        ubf.w((ubf) x.b, c2);
        int i = oieVar.a;
        x.c();
        ubf.v((ubf) x.b, i);
        t.g(((ubf) x.b()).b());
        t.e(epe.b(oieVar.d));
        return s6f.Q((ogf) t.b());
    }

    @Override // defpackage.pxa
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i5 = i2 - intValue;
                if (i2 + i5 <= stackTraceElementArr.length) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (stackTraceElementArr[intValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        }
                    }
                    int intValue2 = i2 - num.intValue();
                    if (i4 < 10) {
                        System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, intValue2);
                        i3 += intValue2;
                        i4++;
                    }
                    i = (intValue2 - 1) + i2;
                    hashMap.put(stackTraceElement, Integer.valueOf(i2));
                    i2 = i + 1;
                }
            }
            stackTraceElementArr2[i3] = stackTraceElementArr[i2];
            i3++;
            i4 = 1;
            i = i2;
            hashMap.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        if (i3 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override // defpackage.xj1
    public long h() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        switch (this.a) {
            case 10:
                return AnalyticsConnectorRegistrar.zza(yvVar);
            default:
                pi1 pi1Var = new pi1();
                t51 t51Var = new t51(4);
                ReferenceQueue referenceQueue = pi1Var.a;
                Set set = pi1Var.b;
                set.add(new kge(pi1Var, referenceQueue, set, t51Var));
                Thread thread = new Thread(new bv4(18, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return pi1Var;
        }
    }

    @Override // defpackage.q3f
    public t6f k(s9e s9eVar) {
        eif eifVar;
        switch (this.a) {
            case 20:
                oke okeVar = (oke) s9eVar;
                ehf w = fhf.w();
                mhf t = nhf.t();
                String str = okeVar.f.a;
                t.c();
                nhf.v((nhf) t.b, str);
                w.c();
                fhf.v((fhf) w.b, (nhf) t.b());
                w6e b2 = ((fhf) w.b()).b();
                zhe zheVar = okeVar.f.b;
                if (zhe.D != zheVar) {
                    if (zhe.E == zheVar) {
                        eifVar = eif.RAW;
                    } else {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zheVar)));
                    }
                } else {
                    eifVar = eif.TINK;
                }
                return t6f.p("type.googleapis.com/google.crypto.tink.KmsAeadKey", b2, 5, eifVar, okeVar.h);
            case 25:
                boe boeVar = (boe) s9eVar;
                yif w2 = zif.w();
                byte[] b3 = ((hlf) boeVar.g.b).b();
                w6e e2 = s6e.e(b3, 0, b3.length);
                w2.c();
                zif.v((zif) w2.b, e2);
                return t6f.p("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zif) w2.b()).b(), 2, pue.b(boeVar.f.a), boeVar.i);
            default:
                mye myeVar = (mye) s9eVar;
                return t6f.p("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", n0f.c(myeVar).b(), 4, (eif) n0f.g.r(myeVar.f.d), myeVar.j);
        }
    }

    @Override // defpackage.k3f
    public s9e n(t6f t6fVar) {
        if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                icf u = icf.u((s6e) t6fVar.e, g7e.a);
                if (u.t() == 0) {
                    hvc b2 = sje.b();
                    b2.C(u.x().b());
                    b2.c = wqe.a((eif) t6fVar.f);
                    sje x = b2.x();
                    jje jjeVar = new jje(0);
                    jjeVar.c = null;
                    jjeVar.d = null;
                    jjeVar.b = x;
                    jjeVar.c = new xk9(hlf.a(u.x().m()), 26);
                    jjeVar.d = (Integer) t6fVar.C;
                    return jjeVar.c();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (w7e unused) {
                hfd.j("Parsing AesGcmSivKey failed");
                return null;
            }
        }
        vs.m("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        return null;
    }

    @Override // defpackage.ace
    /* renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                List list = yme.a;
                s4e s4eVar = (s4e) q4e.b.a.a;
                return (String) s4e.a.get();
            case 12:
                List list2 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", 16).get();
            case 13:
                List list3 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.sgtm.upload.batches_retrieval_limit", 5L, 46).get()).longValue());
            case 14:
                List list4 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.minimum_delay", 500L, 28).get();
            case 15:
                List list5 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.max_queue_time", 518400000L, 73).get();
            case 16:
                List list6 = yme.a;
                o5e.b.get();
                return Integer.valueOf((int) ((Long) p5e.a.K("measurement.test.int_flag", -2L, 3).get()).longValue());
            case 17:
            case 20:
            default:
                HashSet hashSet = new HashSet();
                odd b2 = gje.b();
                b2.l();
                b2.t(16);
                b2.x();
                fje fjeVar = fje.e;
                b2.e = fjeVar;
                hashSet.add(b2.h());
                odd b3 = gje.b();
                b3.l();
                b3.t(32);
                b3.x();
                b3.e = fjeVar;
                hashSet.add(b3.h());
                yv b4 = bie.b();
                b4.L(16);
                b4.N(32);
                b4.T(16);
                b4.Q(16);
                zhe zheVar = zhe.e;
                b4.e = zheVar;
                yhe yheVar = yhe.e;
                b4.f = yheVar;
                hashSet.add(b4.J());
                yv b5 = bie.b();
                b5.L(32);
                b5.N(32);
                b5.T(32);
                b5.Q(16);
                b5.e = zheVar;
                b5.f = yheVar;
                hashSet.add(b5.J());
                hashSet.add(new koe(yhe.G));
                hvc b6 = lwe.b();
                b6.C(64);
                b6.c = jwe.d;
                hashSet.add(b6.y());
                return Collections.unmodifiableSet(hashSet);
            case 18:
                List list7 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.rb.attribution.max_retry_delay_seconds", 16L, 54).get()).longValue());
            case 19:
                List list8 = yme.a;
                a5e a5eVar = (a5e) z4e.b.a.a;
                return (Boolean) a5e.a.get();
            case 21:
                List list9 = yme.a;
                q5e.b.get();
                return (Boolean) r5e.a.A(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get();
            case 22:
                e5e e5eVar = (e5e) d5e.b.a.a;
                return new Boolean(((Boolean) e5e.b.get()).booleanValue());
        }
    }

    public /* synthetic */ jf8(int i) {
        this.a = i;
    }
}
