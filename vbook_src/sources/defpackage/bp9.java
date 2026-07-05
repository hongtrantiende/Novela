package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaCodec;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.common.util.concurrent.ListenableFuture;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bp9  reason: default package */
/* loaded from: classes.dex */
public final class bp9 implements v82, na4, f47, dyc, r4d, oh0, gn9, a2e, OnFailureListener, Continuation, OnCompleteListener, x00, okf {
    public final /* synthetic */ int a;
    public Object b;

    public bp9(Window window, ViewGroup viewGroup) {
        this.a = 10;
        bp9 bp9Var = new bp9(viewGroup);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.b = new wjd(window, bp9Var);
        } else if (i >= 30) {
            this.b = new wjd(window, bp9Var);
        } else if (i >= 26) {
            this.b = new ujd(window, bp9Var);
        } else {
            this.b = new ujd(window, bp9Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [my0, java.lang.Object] */
    public static byte[] m() {
        ?? obj = new Object();
        obj.q1("RIFF");
        obj.n1(8036);
        obj.q1("WAVE");
        obj.q1("fmt ");
        obj.n1(16);
        obj.o1(256);
        obj.o1(256);
        obj.n1(8000);
        obj.n1(8000);
        obj.o1(256);
        obj.o1(2048);
        obj.q1("data");
        obj.n1(8000);
        byte[] p0 = obj.p0(obj.b);
        byte[] bArr = new byte[8000];
        for (int i = 0; i < 8000; i++) {
            bArr[i] = Byte.MIN_VALUE;
        }
        int length = p0.length;
        byte[] copyOf = Arrays.copyOf(p0, length + 8000);
        System.arraycopy(bArr, 0, copyOf, length, 8000);
        return copyOf;
    }

    public void A(int i, Object obj, m2e m2eVar) {
        g0e g0eVar = (g0e) this.b;
        hzd hzdVar = (hzd) obj;
        g0eVar.d(i, 2);
        g0eVar.r(hzdVar.c(m2eVar));
        m2eVar.h(hzdVar, this);
    }

    @Override // defpackage.r4d, defpackage.o4d
    public boolean a() {
        ((oaa) this.b).getClass();
        return false;
    }

    @Override // defpackage.gn9
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 12:
                uvd uvdVar = new uvd(1, (TaskCompletionSource) obj2);
                xwd xwdVar = (xwd) ((wvd) obj).l();
                Parcel e = xwdVar.e();
                int i = bwd.a;
                e.writeStrongBinder(uvdVar);
                bwd.c(e, (fk0) this.b);
                xwdVar.f(e, 1);
                return;
            default:
                int i2 = iye.l;
                ixe ixeVar = new ixe((TaskCompletionSource) obj2);
                uye uyeVar = (uye) ((wye) obj).l();
                byte[] a = ((h1f) this.b).a();
                Parcel S = uyeVar.S();
                wbe.c(S, ixeVar);
                S.writeByteArray(a);
                uyeVar.T(S, 31);
                return;
        }
    }

    @Override // defpackage.f47
    public void b(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // defpackage.f47
    public void c(int i, nd2 nd2Var, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, nd2Var.i, j, i2);
    }

    @Override // defpackage.x00
    public /* synthetic */ ListenableFuture call() {
        return (x1) this.b;
    }

    @Override // defpackage.f47
    public void d(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.oh0
    public void e(int i) {
        ((wz4) this.b).e(i);
    }

    @Override // defpackage.oh0
    public void f() {
        ((wz4) this.b).f();
    }

    @Override // defpackage.k99
    public Object get() {
        return new waa((eba) ((j99) this.b).get());
    }

    @Override // defpackage.o4d
    public long h(js jsVar, js jsVar2, js jsVar3) {
        return ((oaa) this.b).h(jsVar, jsVar2, jsVar3);
    }

    @Override // defpackage.v82
    public Object j(u82 u82Var) {
        return ((xt4) this.b).invoke(u82Var);
    }

    @Override // defpackage.a2e
    public /* synthetic */ void k(l1e l1eVar) {
        ((rwa) this.b).g((p4e) l1eVar);
    }

    @Override // defpackage.o4d
    public js l(long j, js jsVar, js jsVar2, js jsVar3) {
        return ((oaa) this.b).l(j, jsVar, jsVar2, jsVar3);
    }

    public void n() {
        Object value;
        switch (this.a) {
            case 6:
                cza czaVar = ((a0c) this.b).d;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, nzb.a((nzb) value, nae.e, nae.e, null, null, null, null, null, null, null, 0, null, false, null, null, 0, false, false, false, 229375)));
                    return;
                }
                return;
            default:
                tqc tqcVar = (tqc) this.b;
                m41 m41Var = tqcVar.k;
                sw2 sw2Var = ab3.a;
                z87.v(m41Var, ru2.c, null, new ypc(tqcVar, null, 0), 2);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        long j;
        if (exc instanceof rg4) {
            kj kjVar = q9e.e;
            kjVar.B("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            q9e q9eVar = (q9e) ((bv4) this.b).c;
            int i = (int) q9eVar.b;
            if (i != 30 && i != 60 && i != 120 && i != 240 && i != 480) {
                if (i != 960) {
                    j = 30;
                } else {
                    j = 960;
                }
            } else {
                j = 2 * q9eVar.b;
            }
            q9eVar.b = j;
            q9eVar.a = (q9eVar.b * 1000) + System.currentTimeMillis();
            kjVar.B(hl5.k(q9eVar.a, "Scheduling refresh for "), new Object[0]);
            q9eVar.c.postDelayed(q9eVar.d, q9eVar.b * 1000);
        }
    }

    @Override // defpackage.dyc
    public FileChannel p() {
        return new FileInputStream((File) this.b).getChannel();
    }

    public void q(int i, String str) {
        Object value;
        switch (this.a) {
            case 6:
                str.getClass();
                cza czaVar = ((a0c) this.b).d;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, nzb.a((nzb) value, nae.e, nae.e, null, null, null, null, null, null, null, 0, null, false, null, null, 0, false, false, false, 229375)));
                    return;
                }
                return;
            default:
                str.getClass();
                tqc tqcVar = (tqc) this.b;
                kw5 kw5Var = tqcVar.o;
                if (i == 1) {
                    if (kw5Var != null) {
                        kw5Var.z(fpc.a);
                    }
                } else if (kw5Var != null) {
                    kw5Var.z(new epc(str));
                }
                tqcVar.i.c();
                z87.D(new ypc(tqcVar, null, 1));
                return;
        }
    }

    public void r() {
        switch (this.a) {
            case 6:
                return;
            default:
                kw5 kw5Var = ((tqc) this.b).o;
                if (kw5Var != null) {
                    AndroidTextToSpeechService.a((AndroidTextToSpeechService) kw5Var.b).d(true, true);
                    AndroidTextToSpeechService.S = true;
                    return;
                }
                return;
        }
    }

    public void t(int i, int i2) {
        int i3;
        int i4;
        double d;
        Object value;
        Object value2;
        switch (this.a) {
            case 6:
                return;
            default:
                tqc tqcVar = (tqc) this.b;
                int i5 = tqcVar.u;
                int i6 = tqcVar.z;
                tqcVar.y = i;
                kw5 kw5Var = tqcVar.o;
                if (kw5Var != null) {
                    AndroidTextToSpeechService androidTextToSpeechService = (AndroidTextToSpeechService) kw5Var.b;
                    m41 m41Var = androidTextToSpeechService.L;
                    sw2 sw2Var = ab3.a;
                    n35 n35Var = zz6.a.f;
                    mo moVar = new mo(androidTextToSpeechService, i, i2, i6, (m42) null);
                    i3 = i;
                    i4 = i2;
                    i6 = i6;
                    z87.v(m41Var, n35Var, null, moVar, 2);
                    AndroidTextToSpeechService.a((AndroidTextToSpeechService) kw5Var.b).d(false, true);
                    AndroidTextToSpeechService.S = true;
                    npc a = AndroidTextToSpeechService.a((AndroidTextToSpeechService) kw5Var.b);
                    String str = (String) kw5Var.c;
                    a.getClass();
                    str.getClass();
                    cza czaVar = a.b;
                    do {
                        value2 = czaVar.getValue();
                        ((lpc) value2).getClass();
                    } while (!czaVar.l(value2, new lpc(i5, i3, i4, i6, str)));
                } else {
                    i3 = i;
                    i4 = i2;
                }
                tqc tqcVar2 = (tqc) this.b;
                if (i6 > 0) {
                    d = i4 / i6;
                } else {
                    d = 0.0d;
                }
                tqcVar2.x = d;
                npc npcVar = tqcVar2.i;
                String str2 = tqcVar2.a;
                npcVar.getClass();
                str2.getClass();
                cza czaVar2 = npcVar.b;
                do {
                    value = czaVar2.getValue();
                    ((lpc) value).getClass();
                } while (!czaVar2.l(value, new lpc(i5, i3, i4, i6, str2)));
                tqc tqcVar3 = (tqc) this.b;
                if (!tqcVar3.L && tqcVar3.x >= 0.7d) {
                    tqcVar3.L = true;
                    int i7 = i5 + 1;
                    List list = tqcVar3.r;
                    if (list != null) {
                        if (i7 < list.size()) {
                            z87.v(tqcVar3.k, null, null, new pf(tqcVar3, i7, (m42) null, 17), 3);
                            return;
                        }
                        return;
                    }
                    c16.w("chapterList");
                    throw null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.b);
        }
        Exception exception = task.getException();
        am8.s(exception);
        if (exception instanceof rce) {
            if (Log.isLoggable("RecaptchaHandler", 4)) {
                String message = exception.getMessage();
                Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + message);
            }
            return Tasks.forResult("");
        }
        return Tasks.forException(exception);
    }

    @Override // defpackage.o4d
    public js u(long j, js jsVar, js jsVar2, js jsVar3) {
        return ((oaa) this.b).u(j, jsVar, jsVar2, jsVar3);
    }

    @Override // defpackage.o4d
    public js v(js jsVar, js jsVar2, js jsVar3) {
        return ((oaa) this.b).v(jsVar, jsVar2, jsVar3);
    }

    public void x() {
        MediaPlayer mediaPlayer;
        try {
            MediaPlayer mediaPlayer2 = (MediaPlayer) this.b;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = (MediaPlayer) this.b) != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer3 = (MediaPlayer) this.b;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
            }
            this.b = null;
        } catch (Throwable unused) {
        }
    }

    public void y() {
        MediaPlayer mediaPlayer;
        try {
            if (((MediaPlayer) this.b) == null) {
                this.b = new MediaPlayer();
                m66 m66Var = pe4.a;
                hn8 f = hn8.f(ie2.s(m66Var), "silence.wav");
                if (!m66Var.j0(f)) {
                    lj9 lj9Var = new lj9(m66Var.g1(f, false));
                    lj9Var.write(m());
                    lj9Var.close();
                }
                MediaPlayer mediaPlayer2 = (MediaPlayer) this.b;
                if (mediaPlayer2 != null) {
                    Context context = twe.e;
                    context.getClass();
                    Uri fromFile = Uri.fromFile(f.toFile());
                    fromFile.getClass();
                    mediaPlayer2.setDataSource(context, fromFile);
                }
                MediaPlayer mediaPlayer3 = (MediaPlayer) this.b;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
                }
                MediaPlayer mediaPlayer4 = (MediaPlayer) this.b;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setLooping(true);
                }
                MediaPlayer mediaPlayer5 = (MediaPlayer) this.b;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.prepare();
                }
            }
            MediaPlayer mediaPlayer6 = (MediaPlayer) this.b;
            if ((mediaPlayer6 == null || !mediaPlayer6.isPlaying()) && (mediaPlayer = (MediaPlayer) this.b) != null) {
                mediaPlayer.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void z(long j) {
        btd btdVar = ((o7b) this.b).a;
        long y = dye.y(j);
        btdVar.f.setValue(new zy5(y));
        yrd yrdVar = btdVar.c;
        long u = dye.u(y);
        yrdVar.getClass();
        zr1.A();
        if (!az5.a(yrdVar.f, u)) {
            yrdVar.f = u;
            qw6 qw6Var = yrdVar.a;
            qw6Var.getClass();
            mw6 mw6Var = mw6.b;
            if (qw6Var.a(mw6Var)) {
                pj pjVar = qw6Var.b;
                String str = qw6Var.a;
                pjVar.getClass();
                pj.a(mw6Var, str, "ZoomableState. contentOriginSize=" + ((Object) az5.b(u)));
            }
            yrd.e(yrdVar, "contentOriginSizeChanged");
        }
    }

    @Override // defpackage.okf
    public Object zza(String str) {
        ukf ukfVar = (ukf) this.b;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            Provider provider = Security.getProvider(strArr[i2]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return ukfVar.a(str, (Provider) obj);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return ukfVar.a(str, null);
    }

    private final void s() {
    }

    @Override // defpackage.f47
    public void flush() {
    }

    @Override // defpackage.f47
    public void i() {
    }

    @Override // defpackage.f47
    public void shutdown() {
    }

    @Override // defpackage.f47
    public void start() {
    }

    private final void w(int i, int i2) {
    }

    public /* synthetic */ bp9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ bp9(vvd vvdVar, fk0 fk0Var) {
        this.a = 12;
        this.b = fk0Var;
    }

    public bp9() {
        this.a = 22;
        this.b = new AtomicInteger();
    }

    public bp9(k57 k57Var, rwa rwaVar) {
        this.a = 13;
        this.b = rwaVar;
        Objects.requireNonNull(k57Var);
    }

    public bp9(g0e g0eVar) {
        this.a = 14;
        this.b = g0eVar;
        g0eVar.a = this;
    }

    public bp9(yv yvVar, RecaptchaAction recaptchaAction) {
        this.a = 16;
        this.b = recaptchaAction;
        Objects.requireNonNull(yvVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [dsa, xk9, java.lang.Object] */
    public bp9(View view) {
        this.a = 3;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? xk9Var = new xk9(view, 6);
            xk9Var.c = view;
            this.b = xk9Var;
            return;
        }
        this.b = new xk9(view, 6);
    }

    @Override // defpackage.a2e
    /* renamed from: zza  reason: collision with other method in class */
    public void mo0zza(String str) {
        ((rwa) this.b).a(am8.G(str));
    }

    public /* synthetic */ bp9(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l97] */
    public bp9(float f, float f2, js jsVar) {
        g99 g99Var;
        this.a = 9;
        int[] iArr = p4d.a;
        if (jsVar != null) {
            ?? obj = new Object();
            int b = jsVar.b();
            bj4[] bj4VarArr = new bj4[b];
            for (int i = 0; i < b; i++) {
                bj4VarArr[i] = new bj4(f, f2, jsVar.a(i));
            }
            obj.a = bj4VarArr;
            g99Var = obj;
        } else {
            g99Var = new g99(f, f2);
        }
        this.b = new oaa(g99Var);
    }
}
