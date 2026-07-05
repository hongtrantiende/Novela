package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n69  reason: default package */
/* loaded from: classes.dex */
public final class n69 {
    public final Context a;
    public final mfb b;
    public final int c;
    public final mfb d;
    public final mfb e;
    public boolean f;

    public n69(Context context, r2d r2dVar) {
        context.getClass();
        r2dVar.getClass();
        this.a = context;
        this.b = new mfb(new vt4(this) { // from class: m69
            public final /* synthetic */ n69 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                int i = r2;
                n69 n69Var = this.b;
                switch (i) {
                    case 0:
                        return ((o69) n69Var.e.getValue()).a;
                    default:
                        return r4.i(n69Var.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = new mfb(new u76(r2dVar, 26));
        this.e = new mfb(new vt4(this) { // from class: m69
            public final /* synthetic */ n69 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                int i = r2;
                n69 n69Var = this.b;
                switch (i) {
                    case 0:
                        return ((o69) n69Var.e.getValue()).a;
                    default:
                        return r4.i(n69Var.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        mfb mfbVar = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(a(), new l69(Process.myPid(), (String) mfbVar.getValue()));
            return o17.y(linkedHashMap);
        }
        Map singletonMap = Collections.singletonMap(a(), new l69(Process.myPid(), (String) mfbVar.getValue()));
        singletonMap.getClass();
        return singletonMap;
    }
}
