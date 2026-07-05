package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: st4  reason: default package */
/* loaded from: classes.dex */
public final class st4 {
    public static final /* synthetic */ st4[] a = {new Enum("VIDEO_CONTROLS", 0), new Enum("CLOSE_AD", 1), new Enum("NOT_VISIBLE", 2), new Enum("OTHER", 3)};
    /* JADX INFO: Fake field, exist only in values array */
    st4 EF5;

    public static st4 valueOf(String str) {
        return (st4) Enum.valueOf(st4.class, str);
    }

    public static st4[] values() {
        return (st4[]) a.clone();
    }
}
