package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c46 implements e78 {
    public final /* synthetic */ int a;

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                f78 f78Var = (f78) obj2;
                f78Var.a(d99.g, entry.getKey());
                f78Var.a(d99.h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
