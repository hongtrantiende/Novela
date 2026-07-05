package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q60  reason: default package */
/* loaded from: classes.dex */
public final class q60 {
    public final float a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public q60(Context context) {
        this.b = context.getApplicationContext();
        this.d = j55.d;
        this.a = 8.0f;
    }

    public js a(long j, js jsVar, js jsVar2) {
        if (((js) this.d) == null) {
            this.d = jsVar.c();
        }
        js jsVar3 = (js) this.d;
        if (jsVar3 != null) {
            int b = jsVar3.b();
            int i = 0;
            while (true) {
                js jsVar4 = (js) this.d;
                if (i < b) {
                    if (jsVar4 != null) {
                        jsVar.getClass();
                        jsVar4.e(i, ((ui4) this.b).d(jsVar2.a(i), j));
                        i++;
                    } else {
                        c16.w("velocityVector");
                        throw null;
                    }
                } else if (jsVar4 != null) {
                    return jsVar4;
                } else {
                    c16.w("velocityVector");
                    throw null;
                }
            }
        } else {
            c16.w("velocityVector");
            throw null;
        }
    }

    public q60(ui4 ui4Var) {
        this.b = ui4Var;
        this.a = ui4Var.c();
    }
}
