package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.File;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ny0  reason: default package */
/* loaded from: classes.dex */
public abstract class ny0 {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ ny0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public static void d(String str) {
        int i;
        boolean z;
        if (!str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (c16.l(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    public static String e(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void b(int i) {
        this.b = i | this.b;
    }

    public boolean h(int i) {
        if ((this.b & i) == i) {
            return true;
        }
        return false;
    }

    public abstract int i();

    public abstract void j(it4 it4Var);

    public void k(it4 it4Var, int i, int i2) {
        throw new SQLiteException(rs8.k("Can't downgrade database from version ", i, i2, " to "));
    }

    public abstract void m(it4 it4Var, int i, int i2);

    public String toString() {
        switch (this.a) {
            case 2:
                return e(this.b);
            default:
                return super.toString();
        }
    }

    public void l(it4 it4Var) {
    }
}
