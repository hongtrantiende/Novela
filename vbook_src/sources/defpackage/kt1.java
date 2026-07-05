package defpackage;

import android.util.SparseArray;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kt1  reason: default package */
/* loaded from: classes.dex */
public final class kt1 {
    public static final kt1 a;
    public static final /* synthetic */ kt1[] b;
    /* JADX INFO: Fake field, exist only in values array */
    kt1 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kt1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kt1, java.lang.Object] */
    static {
        ?? r0 = new Enum("NOT_SET", 0);
        ?? r1 = new Enum("EVENT_OVERRIDE", 1);
        a = r1;
        b = new kt1[]{r0, r1};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r0);
        sparseArray.put(5, r1);
    }

    public static kt1 valueOf(String str) {
        return (kt1) Enum.valueOf(kt1.class, str);
    }

    public static kt1[] values() {
        return (kt1[]) b.clone();
    }
}
