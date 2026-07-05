package defpackage;

import android.util.Log;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ls2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ls2 implements or6, hu1, mn3, nkc, pr6 {
    public final /* synthetic */ int a;

    public /* synthetic */ ls2(int i) {
        this.a = i;
    }

    public static /* synthetic */ void c() {
        throw new gt1(6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, int i2, String str) {
        throw new IllegalArgumentException((str + i + ((char) i2)).toString());
    }

    public Constructor a() {
        switch (this.a) {
            case 10:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(r94.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(r94.class).getConstructor(null);
        }
    }

    @Override // defpackage.nkc
    public Object apply(Object obj) {
        aba abaVar = (aba) obj;
        String h = bba.b.h(abaVar);
        h.getClass();
        abaVar.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = h.getBytes(ed1.a);
        bytes.getClass();
        return bytes;
    }

    @Override // defpackage.pr6
    public void b(Object obj, ci4 ci4Var) {
        ((az8) obj).c(new zy8(ci4Var));
    }

    @Override // defpackage.mn3
    public float f(float f) {
        float f2;
        float f3;
        switch (this.a) {
            case 19:
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f4 = f - 0.54545456f;
                    f2 = 7.5625f * f4 * f4;
                    f3 = 0.75f;
                } else if (f < 0.90909094f) {
                    float f5 = f - 0.8181818f;
                    f2 = 7.5625f * f5 * f5;
                    f3 = 0.9375f;
                } else {
                    float f6 = f - 0.95454544f;
                    f2 = 7.5625f * f6 * f6;
                    f3 = 0.984375f;
                }
                return f2 + f3;
            default:
                return f;
        }
    }

    @Override // defpackage.or6
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((dd) obj).getClass();
                return;
            case 1:
                ((dd) obj).getClass();
                return;
            case 2:
                ((dd) obj).getClass();
                return;
            case 3:
                ((dd) obj).getClass();
                return;
            case 4:
                ((dd) obj).getClass();
                return;
            case 5:
                ((dd) obj).getClass();
                return;
            case 6:
                ((dd) obj).getClass();
                return;
            case 7:
                ((dd) obj).getClass();
                return;
            case 8:
                ((dd) obj).getClass();
                return;
            case 9:
                ((dd) obj).getClass();
                return;
            case 27:
                ((az8) obj).w(new pz3(2, new gt1("Player release timed out.", 3), 1003));
                return;
            default:
                ((az8) obj).x();
                return;
        }
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        switch (this.a) {
            case 13:
                Set b = yvVar.b(mf9.a(sc0.class));
                fz4 fz4Var = fz4.b;
                if (fz4Var == null) {
                    synchronized (fz4.class) {
                        try {
                            fz4Var = fz4.b;
                            if (fz4Var == null) {
                                fz4Var = new fz4(0);
                                fz4.b = fz4Var;
                            }
                        } finally {
                        }
                    }
                }
                return new ty2(b, fz4Var);
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                ze6 ze6Var = ExecutorsRegistrar.a;
                return nuc.a;
        }
    }

    public /* synthetic */ ls2(Object obj, int i) {
        this.a = i;
    }
}
