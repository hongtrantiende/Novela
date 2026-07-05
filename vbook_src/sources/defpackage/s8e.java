package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s8e  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s8e implements e78 {
    public static final /* synthetic */ s8e b = new s8e(0);
    public static final /* synthetic */ s8e c = new s8e(1);
    public final /* synthetic */ int a;

    public /* synthetic */ s8e(int i) {
        this.a = i;
    }

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                f78 f78Var = (f78) obj2;
                f78Var.a(g9e.g, entry.getKey());
                f78Var.a(g9e.h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
