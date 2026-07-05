package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h88  reason: default package */
/* loaded from: classes.dex */
public class h88 implements j88, a2a, s88, c47, ace, s5f, x5f, gn9, q3f {
    public static h88 b;
    public final /* synthetic */ int a;
    public static final /* synthetic */ h88 c = new h88(11);
    public static final /* synthetic */ h88 d = new h88(12);
    public static final /* synthetic */ h88 e = new h88(13);
    public static final /* synthetic */ h88 f = new h88(14);
    public static final /* synthetic */ h88 C = new h88(15);
    public static final /* synthetic */ h88 D = new h88(16);
    public static final /* synthetic */ h88 E = new h88(17);
    public static final /* synthetic */ h88 F = new h88(18);
    public static final /* synthetic */ h88 G = new h88(19);
    public static final /* synthetic */ h88 H = new h88(20);
    public static final /* synthetic */ h88 I = new h88(21);
    public static final /* synthetic */ h88 J = new h88(22);
    public static final /* synthetic */ h88 K = new h88(26);

    public /* synthetic */ h88(int i) {
        this.a = i;
    }

    public static final int h(int i) {
        if ((i & 2) != 0) {
            return i | 64;
        }
        return i;
    }

    public static final rp i(int i, String str) {
        WeakHashMap weakHashMap = yjd.w;
        return new rp(i, str);
    }

    public static final int j(int i, long j) {
        int i2 = jic.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static final a4d l(int i, String str) {
        WeakHashMap weakHashMap = yjd.w;
        return new a4d(new jx5(0, 0, 0, 0), str);
    }

    public static MediaCodec m(yv yvVar) {
        String str = ((h47) yvVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static yjd n(rv4 rv4Var) {
        View view = (View) rv4Var.j(gh.f);
        yjd o = o(view);
        boolean h = rv4Var.h(o) | rv4Var.h(view);
        Object P = rv4Var.P();
        if (h || P == ax1.a) {
            P = new t3c(19, o, view);
            rv4Var.o0(P);
        }
        yte.b(o, (xt4) P, rv4Var);
        return o;
    }

    public static yjd o(View view) {
        yjd yjdVar;
        WeakHashMap weakHashMap = yjd.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new yjd(view);
                    weakHashMap.put(view, obj);
                }
                yjdVar = (yjd) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yjdVar;
    }

    public static long r(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // defpackage.c47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.d47 a(defpackage.yv r5) {
        /*
            r4 = this;
            r4 = 0
            android.media.MediaCodec r4 = m(r5)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r0 = "configureCodec"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r0 = r5.d     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.view.Surface r0 = (android.view.Surface) r0     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r0 != 0) goto L25
            java.lang.Object r1 = r5.a     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            h47 r1 = (defpackage.h47) r1     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            boolean r1 = r1.h     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r1 == 0) goto L25
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r2 = 35
            if (r1 < r2) goto L25
            r1 = 8
            goto L26
        L21:
            r5 = move-exception
            goto L49
        L23:
            r5 = move-exception
            goto L49
        L25:
            r1 = 0
        L26:
            java.lang.Object r2 = r5.b     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaFormat r2 = (android.media.MediaFormat) r2     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r3 = r5.e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaCrypto r3 = (android.media.MediaCrypto) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r4.configure(r2, r0, r3, r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r0 = "startCodec"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r4.start()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            nfb r0 = new nfb     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r5 = r5.f     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            kz6 r5 = (defpackage.kz6) r5     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.<init>(r4, r5)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r0
        L49:
            if (r4 == 0) goto L4e
            r4.release()
        L4e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h88.a(yv):d47");
    }

    @Override // defpackage.gn9
    public /* synthetic */ void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        wye wyeVar = (wye) obj;
        int i = iye.l;
    }

    @Override // defpackage.s88
    public long b(s94 s94Var) {
        return -1L;
    }

    @Override // defpackage.x5f
    public s6f c(bfe bfeVar) {
        switch (this.a) {
            case 24:
                sje sjeVar = (sje) bfeVar;
                mgf t = ogf.t();
                t.f("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                lcf x = mcf.x();
                int i = sjeVar.a;
                x.c();
                mcf.v((mcf) x.b, i);
                t.g(((mcf) x.b()).b());
                t.e(wqe.b(sjeVar.b));
                return s6f.Q((ogf) t.b());
            case 25:
                mgf t2 = ogf.t();
                t2.f("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                t2.g(djf.v().b());
                t2.e(pue.b(((koe) bfeVar).a));
                return s6f.Q((ogf) t2.b());
            default:
                yxe yxeVar = (yxe) bfeVar;
                mgf t3 = ogf.t();
                t3.f("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
                hdf t4 = idf.t();
                mdf d2 = n0f.d(yxeVar);
                t4.c();
                idf.v((idf) t4.b, d2);
                t3.g(((idf) t4.b()).b());
                t3.e((eif) n0f.g.r(yxeVar.d));
                return s6f.Q((ogf) t3.b());
        }
    }

    @Override // defpackage.s88
    public m4a e() {
        return new ge0(-9223372036854775807L);
    }

    @Override // defpackage.s5f
    public bfe g(s6f s6fVar) {
        ogf ogfVar = (ogf) s6fVar.b;
        if (ogfVar.B().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                ubf u = ubf.u(ogfVar.A(), g7e.a);
                odd b2 = oie.b();
                b2.t(u.t());
                b2.m(u.y().t());
                b2.x();
                b2.e = epe.a(ogfVar.z());
                return b2.g();
            } catch (w7e e2) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
            }
        }
        vs.m(s21.m("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", ogfVar.B()));
        return null;
    }

    @Override // defpackage.q3f
    public t6f k(s9e s9eVar) {
        t6f t6fVar = ((c4f) s9eVar).f;
        int i = g4f.b[a82.C(t6fVar.b)];
        return t6fVar;
    }

    public void p(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public boolean q(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.ace
    /* renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                List list = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp", 14).get();
            case 12:
                List list2 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.upload.url", "https://app-measurement.com/a", 78).get();
            case 13:
                List list3 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.sgtm.upload.max_queued_batches", 5000L, 47).get()).longValue());
            case 14:
                List list4 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.debug_upload_interval", 1000L, 9).get();
            case 15:
                List list5 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.retry_count", 6L, 76).get()).longValue());
            case 16:
                List list6 = yme.a;
                o5e.b.get();
                return (Long) p5e.a.K("measurement.test.cached_long_flag", -1L, 1).get();
            case 17:
                List list7 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.dma_consent.max_daily_dcu_realtime_events", 1L, 18).get()).longValue());
            case 18:
                List list8 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.rb.attribution.max_queue_time", 864000000L, 57).get();
            case 19:
                List list9 = yme.a;
                a5e a5eVar = (a5e) z4e.b.a.a;
                return (Boolean) a5e.b.get();
            case 20:
                List list10 = yme.a;
                y4e y4eVar = (y4e) w4e.b.a.a;
                return (Boolean) y4e.b.get();
            case 21:
                List list11 = yme.a;
                q5e.b.get();
                return (Boolean) r5e.a.A(7, "measurement.rb.attribution.enable_trigger_redaction", true).get();
            default:
                e5e e5eVar = (e5e) d5e.b.a.a;
                return new Boolean(((Boolean) e5e.a.get()).booleanValue());
        }
    }

    @Override // defpackage.j88
    public int d(int i) {
        return i;
    }

    @Override // defpackage.s88
    public void f(long j) {
    }

    @Override // defpackage.j88
    public int w(int i) {
        return i;
    }

    public void s(i29 i29Var, int i, int i2) {
    }

    @Override // defpackage.a2a
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.a2a
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
