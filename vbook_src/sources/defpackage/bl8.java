package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bl8  reason: default package */
/* loaded from: classes.dex */
public final class bl8 implements z69, c82, Continuation, hu1, ace, k3f, q3f, s5f, x5f {
    public final /* synthetic */ int a;
    public static final /* synthetic */ bl8 b = new bl8(9);
    public static final /* synthetic */ bl8 c = new bl8(11);
    public static final /* synthetic */ bl8 d = new bl8(12);
    public static final /* synthetic */ bl8 e = new bl8(13);
    public static final /* synthetic */ bl8 f = new bl8(14);
    public static final /* synthetic */ bl8 C = new bl8(15);
    public static final /* synthetic */ bl8 D = new bl8(16);
    public static final /* synthetic */ bl8 E = new bl8(17);
    public static final /* synthetic */ bl8 F = new bl8(18);
    public static final /* synthetic */ bl8 G = new bl8(19);
    public static final /* synthetic */ bl8 H = new bl8(20);
    public static final /* synthetic */ bl8 I = new bl8(21);
    public static final /* synthetic */ bl8 J = new bl8(22);

    public /* synthetic */ bl8(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
        if (r1.equals("right") == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.m5b a(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl8.a(java.lang.String):m5b");
    }

    public static long b(String str, long j, km1 km1Var) {
        b27 b27Var;
        a27 a27Var;
        x17 b2;
        x17 b3;
        x17 b4;
        if (str != null) {
            Map map = ((qu7) km1Var).L1;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            zl1 zl1Var = (zl1) map.get(lowerCase);
            if (zl1Var != null) {
                return zl1Var.a;
            }
            Pattern compile = Pattern.compile("#([0-9aa-fA-F]{2})([0-9aa-fA-F]{2})([0-9aa-fA-F]{2})");
            compile.getClass();
            Matcher matcher = compile.matcher(str);
            matcher.getClass();
            if (!matcher.matches()) {
                b27Var = null;
            } else {
                b27Var = new b27(matcher, str);
            }
            if (b27Var != null && (b2 = (a27Var = b27Var.c).b(1)) != null && (b3 = a27Var.b(2)) != null && (b4 = a27Var.b(3)) != null) {
                String str2 = b2.a;
                nqe.u(16);
                int parseInt = Integer.parseInt(str2, 16);
                String str3 = b3.a;
                nqe.u(16);
                int parseInt2 = Integer.parseInt(str3, 16);
                String str4 = b4.a;
                nqe.u(16);
                return sve.c(parseInt, parseInt2, Integer.parseInt(str4, 16), 255);
            }
        }
        return j;
    }

    public static Float d(String str) {
        Float C2;
        if (r4b.I(str, "em", false)) {
            return q4b.C(r4b.N(str, false, "em", ""));
        }
        if (r4b.I(str, "px", false)) {
            Float C3 = q4b.C(r4b.N(str, false, "px", ""));
            if (C3 != null) {
                return Float.valueOf(C3.floatValue() / 16.0f);
            }
            return null;
        } else if (r4b.I(str, "%", false) && (C2 = q4b.C(r4b.N(str, false, "%", ""))) != null) {
            return Float.valueOf(C2.floatValue() / 100.0f);
        } else {
            return null;
        }
    }

    public static l5b e(String str) {
        if (str == null) {
            return new l5b();
        }
        List z0 = k4b.z0(str, new String[]{" "});
        ArrayList arrayList = new ArrayList();
        for (Object obj : z0) {
            if (!k4b.j0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Float d2 = d((String) obj2);
            if (d2 != null) {
                arrayList2.add(d2);
            }
        }
        int size2 = arrayList2.size();
        if (size2 != 1) {
            if (size2 != 2) {
                if (size2 != 3) {
                    if (size2 != 4) {
                        return new l5b();
                    }
                    return new l5b(((Number) arrayList2.get(3)).floatValue(), ((Number) arrayList2.get(0)).floatValue(), ((Number) arrayList2.get(2)).floatValue(), ((Number) arrayList2.get(1)).floatValue());
                }
                return new l5b(((Number) arrayList2.get(1)).floatValue(), ((Number) arrayList2.get(0)).floatValue(), ((Number) arrayList2.get(1)).floatValue(), ((Number) arrayList2.get(2)).floatValue());
            }
            float floatValue = ((Number) arrayList2.get(1)).floatValue();
            float floatValue2 = ((Number) arrayList2.get(0)).floatValue();
            return new l5b(floatValue, floatValue2, floatValue2, floatValue);
        }
        float floatValue3 = ((Number) arrayList2.get(0)).floatValue();
        return new l5b(floatValue3, floatValue3, floatValue3, floatValue3);
    }

    public static dgf f(String str) {
        boolean z;
        sgf W;
        jgf jgfVar = igf.e;
        qgf c2 = kff.c();
        sgf sgfVar = c2.b;
        if (sgfVar == bgf.C) {
            sgfVar = null;
            kff.b(c2, null);
            z = true;
        } else {
            z = false;
        }
        if (sgfVar == null) {
            UUID b2 = lff.c.b();
            String o = ref.o(b2);
            e60 e60Var = wff.C;
            ts5 ts5Var = (ts5) kff.a.get();
            if (!ts5Var.isEmpty()) {
                ts5Var.forEach(new tff(1));
            }
            W = new yff(b2, o, str, jgfVar, e60Var, c2);
        } else if (sgfVar instanceof aff) {
            W = ((aff) sgfVar).K0(str, jgfVar, false, c2);
        } else {
            W = sgfVar.W(str, jgfVar, c2);
        }
        kff.b(c2, W);
        return new dgf(W, z);
    }

    @Override // defpackage.x5f
    public s6f c(bfe bfeVar) {
        o7f o7fVar = (o7f) bfeVar;
        mgf t = ogf.t();
        t.f("type.googleapis.com/google.crypto.tink.AesCmacKey");
        eaf x = gaf.x();
        maf v = oaf.v();
        int i = o7fVar.b;
        v.c();
        oaf.u((oaf) v.b, i);
        x.c();
        gaf.w((gaf) x.b, (oaf) v.b());
        int i2 = o7fVar.a;
        x.c();
        gaf.v((gaf) x.b, i2);
        t.g(((gaf) x.b()).b());
        t.e(t8f.b(o7fVar.c));
        return s6f.Q((ogf) t.b());
    }

    @Override // defpackage.s5f
    public bfe g(s6f s6fVar) {
        switch (this.a) {
            case 25:
                ogf ogfVar = (ogf) s6fVar.b;
                if (ogfVar.B().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        if (djf.u(ogfVar.A(), g7e.a).t() == 0) {
                            return new koe(pue.a(ogfVar.z()));
                        }
                        hfd.j("Only version 0 parameters are accepted");
                        return null;
                    } catch (w7e e2) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
                    }
                }
                vs.m(s21.m("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", ogfVar.B()));
                return null;
            default:
                ogf ogfVar2 = (ogf) s6fVar.b;
                if (ogfVar2.B().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    try {
                        return n0f.b(ogfVar2.z(), idf.u(ogfVar2.A(), g7e.a).w());
                    } catch (w7e e3) {
                        throw new GeneralSecurityException("Parsing EciesParameters failed: ", e3);
                    }
                }
                vs.m(s21.m("Wrong type URL in call to EciesProtoSerialization.parseParameters: ", ogfVar2.B()));
                return null;
        }
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        return new wc7();
    }

    @Override // defpackage.q3f
    public t6f k(s9e s9eVar) {
        lje ljeVar = (lje) s9eVar;
        hcf w = icf.w();
        byte[] b2 = ((hlf) ljeVar.g.b).b();
        w6e e2 = s6e.e(b2, 0, b2.length);
        w.c();
        icf.v((icf) w.b, e2);
        return t6f.p("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((icf) w.b()).b(), 2, wqe.b(ljeVar.f.b), ljeVar.i);
    }

    @Override // defpackage.k3f
    public s9e n(t6f t6fVar) {
        if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                rbf u = rbf.u((s6e) t6fVar.e, g7e.a);
                if (u.t() == 0) {
                    odd b2 = oie.b();
                    b2.t(u.z().b());
                    b2.m(u.y().t());
                    b2.x();
                    b2.e = epe.a((eif) t6fVar.f);
                    oie g = b2.g();
                    yx9 yx9Var = new yx9((char) 0, 27);
                    yx9Var.c = null;
                    yx9Var.d = null;
                    yx9Var.b = g;
                    yx9Var.c = new xk9(hlf.a(u.z().m()), 26);
                    yx9Var.d = (Integer) t6fVar.C;
                    return yx9Var.p();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (w7e unused) {
                hfd.j("Parsing AesEaxKey failed");
                return null;
            }
        }
        vs.m("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    @Override // defpackage.ace
    /* renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                List list = yme.a;
                s4e s4eVar = (s4e) q4e.b.a.a;
                return (String) s4e.b.get();
            case 12:
                List list2 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.sgtm.service_upload_apps_list", "", 44).get();
            case 13:
                List list3 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.sgtm.upload.min_delay_after_startup", 5000L, 50).get();
            case 14:
                List list4 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.alarm_manager.minimum_interval", 60000L, 27).get();
            case 15:
                List list5 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.google_signal_max_queue_time", 605000L, 15).get();
            case 16:
                List list6 = yme.a;
                o5e.b.get();
                hvc hvcVar = p5e.a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) hvcVar.b;
                l4f l4fVar = (l4f) atomicReferenceArray.get(2);
                if (l4fVar == null) {
                    l4f l4fVar2 = new l4f("measurement.test.double_flag", (k32) ((xk9) hvcVar.c).b);
                    while (true) {
                        if (atomicReferenceArray.compareAndSet(2, null, l4fVar2)) {
                            l4fVar = l4fVar2;
                        } else if (atomicReferenceArray.get(2) != null) {
                            l4fVar = (l4f) atomicReferenceArray.get(2);
                            l4fVar.getClass();
                        }
                    }
                }
                return (Double) l4fVar.get();
            case 17:
                List list7 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.rb.attribution.uri_scheme", "https", 60).get();
            case 18:
                List list8 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.rb.attribution.client.min_time_after_boot_seconds", 90L, 55).get()).longValue());
            case 19:
                List list9 = yme.a;
                a5e a5eVar = (a5e) z4e.b.a.a;
                return (Boolean) a5e.c.get();
            case 20:
                List list10 = yme.a;
                e6e e6eVar = (e6e) c6e.b.a.a;
                return (Boolean) e6e.a.get();
            case 21:
                List list11 = yme.a;
                v5e v5eVar = (v5e) t5e.b.a.a;
                return (Boolean) v5e.a.get();
            default:
                n5e n5eVar = (n5e) k5e.b.a.a;
                return new Boolean(((Boolean) n5e.a.get()).booleanValue());
        }
    }

    @Override // defpackage.z69
    public void i() {
    }

    @Override // defpackage.z69
    public void l(int i, Object obj) {
    }
}
