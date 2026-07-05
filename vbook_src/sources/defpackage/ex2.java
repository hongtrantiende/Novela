package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.ViewGroup;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ex2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ex2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ex2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = 3;
        boolean z5 = true;
        switch (this.a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.b;
                viewGroup.getClass();
                viewGroup.endViewTransition(null);
                throw null;
            case 1:
                ((wy2) ((kw5) this.b).c).h.a((uad) this.c);
                return;
            case 2:
                Callable callable = (Callable) this.b;
                v03 v03Var = (v03) ((mce) this.c).a;
                try {
                    v03Var.j(callable.call());
                    return;
                } catch (Exception e) {
                    v03Var.k(e);
                    return;
                }
            case 3:
                i04 i04Var = (i04) this.b;
                n04 n04Var = (n04) this.c;
                int i3 = i04Var.I - n04Var.b;
                i04Var.I = i3;
                if (n04Var.e) {
                    i04Var.J = n04Var.c;
                    i04Var.K = true;
                }
                if (i3 == 0) {
                    aac aacVar = ((ly8) n04Var.f).a;
                    int i4 = -1;
                    if (!i04Var.q0.a.p() && aacVar.p()) {
                        i04Var.r0 = -1;
                        i04Var.s0 = 0L;
                    }
                    if (!aacVar.p()) {
                        List asList = Arrays.asList(((l09) aacVar).h);
                        if (asList.size() == i04Var.p.size()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        wq9.D(z4);
                        for (int i5 = 0; i5 < asList.size(); i5++) {
                            ((e04) i04Var.p.get(i5)).b = (aac) asList.get(i5);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (i04Var.K) {
                        if (((ly8) n04Var.f).a.p() && i04Var.q0.a.p()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean equals = ((ly8) n04Var.f).b.equals(i04Var.q0.b);
                        if (((ly8) n04Var.f).d == i04Var.q0.s) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 || (equals && z3)) {
                            z5 = false;
                        }
                        if (z5) {
                            i4 = i04Var.i();
                            if (!aacVar.p() && !((ly8) n04Var.f).b.b()) {
                                ly8 ly8Var = (ly8) n04Var.f;
                                e67 e67Var = ly8Var.b;
                                long j3 = ly8Var.d;
                                Object obj = e67Var.a;
                                y9c y9cVar = i04Var.o;
                                aacVar.g(obj, y9cVar);
                                j2 = j3 + y9cVar.e;
                            } else {
                                j2 = ((ly8) n04Var.f).d;
                            }
                        }
                        i = i4;
                        j = j2;
                        z = z5;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        z = false;
                    }
                    i04Var.K = false;
                    i04Var.V((ly8) n04Var.f, 1, z, i04Var.J, j, i, false);
                    return;
                }
                return;
            case 4:
                ((gb4) this.b).a((Intent) this.c);
                return;
            case 5:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e2) {
                    taskCompletionSource.setException(e2);
                    return;
                }
            case 6:
                ((f61) this.b).E((n35) this.c);
                return;
            case 7:
                mce mceVar = ((g85) this.b).c;
                Uri uri = ((g75) this.c).I;
                gu2 gu2Var = (gu2) ((h75) mceVar.a).b.d.get(uri);
                if (gu2Var != null) {
                    gu2.b(gu2Var, uri, true);
                    return;
                }
                return;
            case 8:
                dn5 dn5Var = (dn5) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(dn5Var.o());
                    return;
                } catch (Exception e3) {
                    taskCompletionSource2.setException(e3);
                    return;
                }
            case 9:
                int i6 = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) this.b).jobFinished((JobParameters) this.c, false);
                return;
            case 10:
                k47 k47Var = (k47) this.b;
                k47Var.Z.set(k47Var.y((s6f) this.c, k47Var.T, 0));
                return;
            case 11:
                l57.d((l57) this.b, (TrackChangeEvent) this.c);
                return;
            case 12:
                l57.c((l57) this.b, (NetworkEvent) this.c);
                return;
            case 13:
                l57.a((l57) this.b, (PlaybackErrorEvent) this.c);
                return;
            case 14:
                l57.b((l57) this.b, (PlaybackMetrics) this.c);
                return;
            case 15:
                l57.e((l57) this.b, (PlaybackStateEvent) this.c);
                return;
            case 16:
                ((h12) this.b).accept((k67) this.c);
                return;
            case 17:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.c).registerReceiver(new u40((f28) this.b, 1), intentFilter);
                return;
            case 18:
                Context context = (Context) this.c;
                f28 f28Var = (f28) ((u40) this.b).b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            if (type != 9) {
                                                i2 = 8;
                                            } else {
                                                i2 = 7;
                                            }
                                        }
                                        i2 = 5;
                                    }
                                }
                                i2 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i2 = 4;
                                    break;
                                case 13:
                                    i2 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i2 = 6;
                                    break;
                                case 18:
                                    i2 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i2 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i2 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT < 31 && i2 == 5) {
                        ih.d(context, f28Var);
                        return;
                    } else {
                        f28Var.c(i2);
                        return;
                    }
                }
                i2 = 0;
                if (Build.VERSION.SDK_INT < 31) {
                }
                f28Var.c(i2);
                return;
            case 19:
                ((w5a) this.b).j((ec8) this.c, pvc.a);
                return;
            case 20:
                j09.a((j09) this.b, (Bitmap) this.c);
                return;
            case 21:
                v69 v69Var = (v69) this.b;
                hmd hmdVar = (hmd) this.c;
                synchronized (v69Var.k) {
                    try {
                        ArrayList arrayList = v69Var.j;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj2 = arrayList.get(i7);
                            i7++;
                            ((qy3) obj2).b(hmdVar, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 22:
                ((b89) this.b).E((m4a) this.c);
                return;
            case 23:
                hp9 hp9Var = (hp9) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    knc.a().d.c(hp9Var.h.a.b(c69.c), 1);
                } catch (Exception unused2) {
                }
                countDownLatch.countDown();
                return;
            case 24:
                ((cw) this.b).f((Typeface) this.c);
                return;
            case 25:
                nwa nwaVar = (nwa) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                SurfaceTexture surfaceTexture2 = nwaVar.C;
                Surface surface = nwaVar.D;
                Surface surface2 = new Surface(surfaceTexture);
                nwaVar.C = surfaceTexture;
                nwaVar.D = surface2;
                Iterator it = nwaVar.a.iterator();
                while (it.hasNext()) {
                    ((c04) it.next()).a.Q(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 26:
                ((rwa) ((oaa) this.b).c).u((qya) this.c, 3);
                return;
            case 27:
                Runnable runnable = (Runnable) this.b;
                r9a r9aVar = (r9a) this.c;
                try {
                    runnable.run();
                    return;
                } finally {
                    r9aVar.a();
                }
            case 28:
                c04 c04Var = ((b60) this.b).b;
                String str = a2d.a;
                kw5.c(c04Var.a.F, (uk1) this.c);
                return;
            default:
                uad uadVar = (uad) this.c;
                c04 c04Var2 = ((b60) this.b).b;
                String str2 = a2d.a;
                i04 i04Var2 = c04Var2.a;
                i04Var2.l0 = uadVar;
                i04Var2.m.e(25, new js2(uadVar));
                return;
        }
    }
}
