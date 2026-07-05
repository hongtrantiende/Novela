package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o9a  reason: default package */
/* loaded from: classes3.dex */
public interface o9a {
    String a();

    default boolean c() {
        return false;
    }

    int d(String str);

    bze e();

    int f();

    String g(int i);

    default List getAnnotations() {
        return ks3.a;
    }

    List h(int i);

    o9a i(int i);

    default boolean isInline() {
        return false;
    }

    boolean j(int i);
}
