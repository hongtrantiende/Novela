package defpackage;

import java.util.function.Supplier;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o3e  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o3e extends ThreadLocal {
    public final /* synthetic */ Supplier a;

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return this.a.get();
    }
}
