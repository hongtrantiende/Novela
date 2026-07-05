package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import okhttp3.Call;
import org.chromium.net.UrlRequest;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x0(nx2 nx2Var, kwa kwaVar) {
        this.a = 16;
        this.b = nx2Var;
    }

    private final void a() {
        dp4 dp4Var = (dp4) this.b;
        synchronized (dp4Var.d) {
            try {
                if (dp4Var.D == null) {
                    return;
                }
                try {
                    fq4 c = dp4Var.c();
                    int i = c.f;
                    if (i == 2) {
                        synchronized (dp4Var.d) {
                        }
                    }
                    if (i == 0) {
                        int i2 = sic.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        lh9 lh9Var = dp4Var.c;
                        Context context = dp4Var.a;
                        lh9Var.getClass();
                        fq4[] fq4VarArr = {c};
                        fbe fbeVar = qsc.a;
                        Trace.beginSection(sxd.o("TypefaceCompat.createFromFontInfo"));
                        Typeface z = qsc.a.z(context, fq4VarArr, 0);
                        Trace.endSection();
                        MappedByteBuffer i0 = hbe.i0(dp4Var.a, c.a);
                        if (i0 != null && z != null) {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            oaa oaaVar = new oaa(z, fca.z(i0));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (dp4Var.d) {
                                axe axeVar = dp4Var.D;
                                if (axeVar != null) {
                                    axeVar.o(oaaVar);
                                }
                            }
                            dp4Var.a();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                } catch (Throwable th) {
                    synchronized (dp4Var.d) {
                        try {
                            axe axeVar2 = dp4Var.D;
                            if (axeVar2 != null) {
                                axeVar2.n(th);
                            }
                            dp4Var.a();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Object obj;
        int i;
        String C;
        TelephonyManager telephonyManager;
        switch (this.a) {
            case 0:
                ((z0) this.b).b();
                return;
            case 1:
                wg wgVar = (wg) this.b;
                Trace.beginSection("measureAndLayout");
                try {
                    wgVar.d.u(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        wgVar.m();
                        Trace.endSection();
                        wgVar.f0 = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                ActionMode actionMode = ((cn) this.b).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 3:
                v30 v30Var = (v30) this.b;
                synchronized (v30Var.a) {
                    try {
                        if (!v30Var.m) {
                            long j = v30Var.l - 1;
                            v30Var.l = j;
                            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                            if (i2 <= 0) {
                                if (i2 < 0) {
                                    IllegalStateException illegalStateException = new IllegalStateException();
                                    synchronized (v30Var.a) {
                                        v30Var.n = illegalStateException;
                                    }
                                    return;
                                }
                                v30Var.a();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 4:
                o40 o40Var = (o40) this.b;
                ((Context) o40Var.b).unregisterReceiver((n40) o40Var.c);
                return;
            case 5:
                n40 n40Var = (n40) this.b;
                if (n40Var.c.a) {
                    n40Var.a.a.U(3, false);
                    return;
                }
                return;
            case 6:
                ((koc) this.b).i();
                return;
            case 7:
                rr6 rr6Var = (rr6) this.b;
                rr6Var.getClass();
                if (Thread.currentThread() == rr6Var.a) {
                    rr6Var.e(-1, new vs(9));
                    return;
                }
                return;
            case 8:
                ((CarouselLayoutManager) this.b).k0();
                return;
            case 9:
                xt1 xt1Var = (xt1) this.b;
                Runnable runnable = xt1Var.b;
                if (runnable != null) {
                    runnable.run();
                    xt1Var.b = null;
                    return;
                }
                return;
            case 10:
                fu1.a((fu1) this.b);
                return;
            case 11:
                ((uwd) ((wb2) this.b).e()).r(new ox4("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 3));
                return;
            case 12:
                ((uwd) ((cc2) this.b).e()).r(new ox4("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 3));
                return;
            case 13:
                Iterator it = ((jc2) this.b).b.entrySet().iterator();
                while (it.hasNext()) {
                    try {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((Call) entry.getKey()).Q()) {
                            it.remove();
                            ((UrlRequest) entry.getValue()).cancel();
                        }
                    } catch (RuntimeException e) {
                        Log.w("CronetInterceptor", "Unable to propagate cancellation status", e);
                    }
                }
                return;
            case 14:
                ms2 ms2Var = (ms2) this.b;
                ms2Var.N(ms2Var.I(), 1028, new gs2(13));
                ms2Var.f.d();
                return;
            case 15:
                vs2 vs2Var = (vs2) this.b;
                if (vs2Var.a0 >= 300000) {
                    ((e47) vs2Var.n.b).p1 = true;
                    vs2Var.a0 = 0L;
                    return;
                }
                return;
            case 16:
                ((nx2) this.b).a(null);
                return;
            case 17:
                ((zx2) this.b).d(false);
                return;
            case 18:
                ((ly2) this.b).i();
                return;
            case 19:
                ((wy2) this.b).h.d();
                return;
            case 20:
                i04 i04Var = (i04) this.b;
                t6f t6fVar = i04Var.B;
                Context context = i04Var.e;
                String str = a2d.a;
                int generateAudioSessionId = h50.n(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                t6fVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((ggb) t6fVar.d).a.getLooper()) {
                    obj = t6fVar.f;
                } else {
                    if (myLooper == ((ggb) t6fVar.c).a.getLooper()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    wq9.D(z);
                    obj = t6fVar.C;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    t6fVar.C = valueOf;
                    mg0 mg0Var = new mg0(t6fVar, valueOf, 0);
                    ggb ggbVar = (ggb) t6fVar.d;
                    if (ggbVar.a.getLooper().getThread().isAlive()) {
                        ggbVar.d(mg0Var);
                    }
                    i04Var.J(1, Integer.valueOf(generateAudioSessionId), 10);
                    i04Var.J(2, Integer.valueOf(generateAudioSessionId), 10);
                    return;
                }
                return;
            case 21:
                ms2 ms2Var2 = ((q04) this.b).S;
                ms2Var2.N(ms2Var2.I(), 1034, new gs2(5));
                return;
            case 22:
                c09 c09Var = (c09) this.b;
                try {
                    synchronized (c09Var) {
                    }
                    c09Var.a.d(c09Var.c, c09Var.d);
                    c09Var.a(true);
                    return;
                } catch (pz3 e2) {
                    st0.i("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
                    fb4.l(e2);
                    return;
                }
            case 23:
                a();
                return;
            case 24:
                Iterator it2 = ((hs4) this.b).n.iterator();
                if (!it2.hasNext()) {
                    return;
                }
                throw rs8.f(it2);
            case 25:
                ((mce) this.b).l();
                return;
            case 26:
                w26 w26Var = (w26) this.b;
                if (w26Var != null) {
                    w26Var.cancel(null);
                    return;
                }
                return;
            case 27:
                e28 e28Var = (e28) this.b;
                xs2 xs2Var = (xs2) e28Var.a.get();
                if (xs2Var != null) {
                    int b = e28Var.c.b();
                    ys2 ys2Var = xs2Var.a;
                    synchronized (ys2Var) {
                        int i3 = ys2Var.n;
                        if (i3 == 0 || ys2Var.e) {
                            if (i3 != b || ys2Var.o == null) {
                                ys2Var.n = b;
                                if (b != 1 && b != 0 && b != 8) {
                                    if (ys2Var.o == null) {
                                        Context context2 = ys2Var.a;
                                        String str2 = a2d.a;
                                        if (context2 != null && (telephonyManager = (TelephonyManager) context2.getSystemService("phone")) != null) {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (!TextUtils.isEmpty(networkCountryIso)) {
                                                C = kve.C(networkCountryIso);
                                                ys2Var.o = C;
                                            }
                                        }
                                        C = kve.C(Locale.getDefault().getCountry());
                                        ys2Var.o = C;
                                    }
                                    ys2Var.l = ys2Var.a(b);
                                    ys2Var.d.getClass();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    if (ys2Var.g > 0) {
                                        i = (int) (elapsedRealtime - ys2Var.h);
                                    } else {
                                        i = 0;
                                    }
                                    ys2Var.b(ys2Var.i, ys2Var.l, i);
                                    ys2Var.h = elapsedRealtime;
                                    ys2Var.i = 0L;
                                    ys2Var.k = 0L;
                                    ys2Var.j = 0L;
                                    ypa ypaVar = ys2Var.f;
                                    ((ArrayList) ypaVar.f).clear();
                                    ypaVar.b = -1;
                                    ypaVar.c = 0;
                                    ypaVar.d = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 28:
                ((xy8) this.b).m--;
                return;
            default:
                ((qz8) this.b).s();
                return;
        }
    }

    public /* synthetic */ x0(q04 q04Var, int i) {
        this.a = 21;
        this.b = q04Var;
    }

    public /* synthetic */ x0(q04 q04Var, c09 c09Var) {
        this.a = 22;
        this.b = c09Var;
    }

    public /* synthetic */ x0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
