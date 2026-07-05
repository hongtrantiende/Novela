package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: and  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class and implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ and(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, wmd] */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        iw9 h1;
        int i = this.a;
        String str = this.b;
        cw9 cw9Var = (cw9) obj;
        switch (i) {
            case 0:
                cw9Var.getClass();
                h1 = cw9Var.h1("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    h1.b0(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (h1.Z0()) {
                        String s0 = h1.s0(0);
                        jmd t = fxe.t((int) h1.getLong(1));
                        s0.getClass();
                        ?? obj2 = new Object();
                        obj2.a = s0;
                        obj2.b = t;
                        arrayList.add(obj2);
                    }
                    return arrayList;
                } finally {
                }
            default:
                cw9Var.getClass();
                h1 = cw9Var.h1("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    h1.b0(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (h1.Z0()) {
                        arrayList2.add(h1.s0(0));
                    }
                    return arrayList2;
                } finally {
                }
        }
    }
}
