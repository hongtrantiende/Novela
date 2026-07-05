package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a50  reason: default package */
/* loaded from: classes.dex */
public final class a50 {
    public final c9b a;
    public final Handler b;
    public q04 c;
    public l40 d;
    public int f;
    public f50 h;
    public float g = 1.0f;
    public int e = 0;

    public a50(Context context, Looper looper, q04 q04Var) {
        this.a = kte.j(new z40(context, 0));
        this.c = q04Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i != 1 && i != 0 && this.h != null) {
            h50.b((AudioManager) this.a.get(), this.h);
        }
    }

    public final void b(int i) {
        float f;
        if (this.e != i) {
            this.e = i;
            if (i == 4) {
                f = 0.2f;
            } else {
                f = 1.0f;
            }
            if (this.g != f) {
                this.g = f;
                q04 q04Var = this.c;
                if (q04Var != null) {
                    q04Var.D.f(34);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, b50] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, b50] */
    public final int c(int i, boolean z) {
        int i2;
        b50 b50Var;
        if (i != 1 && (i2 = this.f) == 1) {
            int i3 = this.e;
            if (z) {
                if (i3 != 2) {
                    f50 f50Var = this.h;
                    if (f50Var == null) {
                        if (f50Var == null) {
                            ?? obj = new Object();
                            obj.c = l40.b;
                            obj.b = i2;
                            b50Var = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.b = f50Var.a;
                            obj2.c = f50Var.d;
                            b50Var = obj2;
                        }
                        l40 l40Var = this.d;
                        l40Var.getClass();
                        b50Var.c = l40Var;
                        b50Var.a = true;
                        fo foVar = new fo(this, 1);
                        Handler handler = this.b;
                        handler.getClass();
                        this.h = new f50(b50Var.b, foVar, handler, (l40) b50Var.c, b50Var.a);
                    }
                    int v = h50.v((AudioManager) this.a.get(), this.h);
                    if (v != 1 && v != 2) {
                        b(1);
                        return -1;
                    }
                    b(2);
                    return 1;
                }
            } else if (i3 == 1) {
                return -1;
            } else {
                if (i3 == 3) {
                    return 0;
                }
            }
            return 1;
        }
        a();
        b(0);
        return 1;
    }
}
