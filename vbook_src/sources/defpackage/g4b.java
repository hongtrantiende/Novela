package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g4b  reason: default package */
/* loaded from: classes3.dex */
public interface g4b {
    static {
        int i = f4b.a;
    }

    Set a();

    default String b(String str) {
        List e = e(str);
        if (e != null) {
            return (String) sl1.e0(e);
        }
        return null;
    }

    default void c(lu4 lu4Var) {
        for (Map.Entry entry : a()) {
            lu4Var.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    default boolean contains(String str) {
        if (e(str) != null) {
            return true;
        }
        return false;
    }

    boolean d();

    List e(String str);

    boolean isEmpty();

    Set names();
}
