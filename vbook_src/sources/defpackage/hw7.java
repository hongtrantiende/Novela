package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hw7  reason: default package */
/* loaded from: classes.dex */
public abstract class hw7 {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        c(i, size);
    }

    public static final void b(int i, List list, int i2) {
        if (i > i2) {
            f(i, i2);
        }
        if (i < 0) {
            d(i);
        }
        if (i2 > list.size()) {
            e(i2, list.size());
        }
    }

    private static final void c(int i, int i2) {
        throw new IndexOutOfBoundsException(hl5.i(i, i2, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(hl5.l("fromIndex (", ") is less than 0.", i));
    }

    private static final void e(int i, int i2) {
        throw new IndexOutOfBoundsException(hl5.i(i, i2, "toIndex (", ") is more than than the list size (", ")"));
    }

    private static final void f(int i, int i2) {
        throw new IllegalArgumentException(hl5.i(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
