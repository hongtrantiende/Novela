package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ejf  reason: default package */
/* loaded from: classes.dex */
public class ejf implements c47, tu8, wr7 {
    public static final ejf d = new ejf(null, true, null);
    public boolean a;
    public Object b;
    public Object c;

    public ejf(String str, boolean z, Exception exc) {
        this.a = z;
        this.b = str;
        this.c = exc;
    }

    public static ejf m(String str) {
        return new ejf(str, false, null);
    }

    public static ejf n(String str, Exception exc) {
        return new ejf(str, false, exc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c1, code lost:
        r4 = j(r17.substring(r9, r6));
        r4.getClass();
        r9 = r4.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ce, code lost:
        if (r11 >= r9) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d0, code lost:
        r8.add(java.lang.Integer.valueOf(r4[r11]));
        r8.add(0);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01df, code lost:
        r9 = r6;
     */
    @Override // defpackage.tu8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] b(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejf.b(java.lang.String):int[]");
    }

    @Override // defpackage.wr7
    public boolean c(long j) {
        ol6 ol6Var;
        gtb gtbVar = (gtb) this.c;
        if (gtbVar.k() && gtbVar.n().a.b.length() != 0 && (ol6Var = gtbVar.d) != null && ol6Var.d() != null) {
            k(gtbVar.n(), j, false, abf.H);
            return true;
        }
        return false;
    }

    @Override // defpackage.wr7
    public void d() {
        if (this.a) {
            gtb.b((gtb) this.c, (fxb) this.b);
        }
    }

    @Override // defpackage.wr7
    public boolean e(long j, h6a h6aVar, int i) {
        ol6 ol6Var;
        gtb gtbVar = (gtb) this.c;
        if (gtbVar.k() && gtbVar.n().a.b.length() != 0 && (ol6Var = gtbVar.d) != null && ol6Var.d() != null) {
            zm4 zm4Var = gtbVar.l;
            if (zm4Var != null) {
                zm4.a(zm4Var);
            }
            gtbVar.o = j;
            gtbVar.t = -1;
            gtbVar.h(true);
            long k = k(gtbVar.n(), gtbVar.o, true, h6aVar);
            if (i >= 2) {
                this.a = true;
                this.b = new fxb(k);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.wr7
    public boolean f(long j, h6a h6aVar) {
        ol6 ol6Var;
        gtb gtbVar = (gtb) this.c;
        if (gtbVar.k() && gtbVar.n().a.b.length() != 0 && (ol6Var = gtbVar.d) != null && ol6Var.d() != null) {
            k(gtbVar.n(), j, false, h6aVar);
            return true;
        }
        return false;
    }

    @Override // defpackage.wr7
    public boolean g(long j) {
        gtb gtbVar = (gtb) this.c;
        ol6 ol6Var = gtbVar.d;
        if (ol6Var != null && ol6Var.d() != null && gtbVar.k()) {
            gtbVar.t = -1;
            zm4 zm4Var = gtbVar.l;
            if (zm4Var != null) {
                zm4.a(zm4Var);
            }
            k(gtbVar.n(), j, false, abf.H);
            return true;
        }
        return false;
    }

    public boolean h(long j) {
        Object obj;
        List list = (List) ((eb5) this.c).b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (y09.a(((b19) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        b19 b19Var = (b19) obj;
        if (b19Var == null) {
            return false;
        }
        return b19Var.h;
    }

    @Override // defpackage.c47
    /* renamed from: i */
    public r30 a(yv yvVar) {
        MediaCodec mediaCodec;
        f47 u30Var;
        int i;
        r30 r30Var;
        String str = ((h47) yvVar.a).a;
        r30 r30Var2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (this.a && Build.VERSION.SDK_INT >= 36) {
                    u30Var = new bp9(mediaCodec, 5);
                    i = 4;
                } else {
                    u30Var = new u30(mediaCodec, (HandlerThread) ((q30) this.c).get());
                    i = 0;
                }
                r30Var = new r30(mediaCodec, (HandlerThread) ((q30) this.b).get(), u30Var, (kz6) yvVar.f);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) yvVar.d;
                if (surface == null && ((h47) yvVar.a).h && Build.VERSION.SDK_INT >= 35) {
                    i |= 8;
                }
                r30.t(r30Var, (MediaFormat) yvVar.b, surface, (MediaCrypto) yvVar.e, i);
                return r30Var;
            } catch (Exception e2) {
                e = e2;
                r30Var2 = r30Var;
                if (r30Var2 == null) {
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                } else {
                    r30Var2.a();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    public int[] j(String str) {
        int[] a;
        qla qlaVar = (qla) this.b;
        qla qlaVar2 = (qla) this.c;
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            if (this.a && ('0' > charAt || charAt >= ':')) {
                if (qlaVar2 != null) {
                    return qlaVar2.a(str);
                }
                return null;
            } else if ('0' <= charAt && charAt < ':') {
                if (qlaVar2 != null && (a = qlaVar2.a(str)) != null) {
                    return a;
                }
                return qlaVar.a(str);
            } else if (('a' <= charAt && charAt < '{') || ('A' <= charAt && charAt < '[')) {
                return qlaVar.a(str);
            } else {
                if (qlaVar2 != null) {
                    return qlaVar2.a(str);
                }
                return null;
            }
        }
        return null;
    }

    public long k(jub jubVar, long j, boolean z, h6a h6aVar) {
        l35 l35Var;
        gtb gtbVar = (gtb) this.c;
        long c = gtb.c(gtbVar, jubVar, j, z, false, h6aVar, false, null);
        if (!fxb.b((fxb) this.b, c)) {
            this.a = false;
        }
        if (fxb.d(c)) {
            l35Var = l35.c;
        } else {
            l35Var = l35.b;
        }
        gtbVar.q(l35Var);
        return c;
    }

    public String l() {
        return (String) this.b;
    }
}
