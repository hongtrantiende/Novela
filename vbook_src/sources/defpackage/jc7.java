package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jc7  reason: default package */
/* loaded from: classes.dex */
public abstract class jc7 {
    public final int a;
    public final int b;

    public jc7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(it4 it4Var) {
        it4Var.getClass();
        throw new Error("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(cw9 cw9Var) {
        cw9Var.getClass();
        if (cw9Var instanceof h9b) {
            a(((h9b) cw9Var).a);
            return;
        }
        throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
