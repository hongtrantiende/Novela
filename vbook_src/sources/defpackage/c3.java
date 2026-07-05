package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ c3(int i, Collection collection) {
        this.a = i;
        this.b = collection;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.a;
        Collection<?> collection = this.b;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
