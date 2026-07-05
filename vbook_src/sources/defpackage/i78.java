package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i78  reason: default package */
/* loaded from: classes.dex */
public abstract class i78 {
    public static final Object[] a = new Object[0];
    public static final kv7 b = new kv7(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        cy7.k(hl5.i(i, size, "Index ", " is out of bounds. The list has ", " elements."));
    }

    public static final void b(int i, List list, int i2) {
        int size = list.size();
        if (i <= i2) {
            if (i >= 0) {
                if (i2 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
            }
            cy7.k(hl5.l("fromIndex (", ") is less than 0.", i));
            return;
        }
        vs.m(hl5.i(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
