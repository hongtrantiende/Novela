package defpackage;

import android.app.RemoteAction;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.pdf.models.selection.SelectionBoundary;
import android.util.Base64;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Slot;
import org.mozilla.javascript.SlotMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cp8 */
/* loaded from: classes.dex */
public final /* synthetic */ class cp8 implements u94, fz2, te3, fw9, h12, SlotMap.SlotComputer {
    public static /* bridge */ /* synthetic */ RemoteAction a(Object obj) {
        return (RemoteAction) obj;
    }

    public static /* bridge */ /* synthetic */ SelectionBoundary e(Object obj) {
        return (SelectionBoundary) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier h(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* synthetic */ void i() {
        throw new AssertionError();
    }

    public static /* synthetic */ void j(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void k(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void l(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void m(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalArgumentException(str + obj + '.');
    }

    public static /* synthetic */ void o(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void p(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void q() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void r(Object obj, Object obj2, String str) {
        throw new gt1(str + obj + obj2, 2);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // defpackage.h12
    public void accept(Object obj) {
        ((dx9) obj).b.getClass();
    }

    @Override // defpackage.fw9
    public Object apply(Object obj) {
        byte[] decode;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                ij1 a = ld0.a();
                a.U(rawQuery.getString(1));
                a.d = d69.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string, 0);
                }
                a.c = decode;
                arrayList.add(a.l());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // defpackage.u94
    public r94[] b() {
        return new r94[]{new p99()};
    }

    @Override // org.mozilla.javascript.SlotMap.SlotComputer
    public Slot compute(Object obj, int i, Slot slot) {
        Slot checkSlotRemoval;
        checkSlotRemoval = ScriptableObject.checkSlotRemoval(obj, i, slot);
        return checkSlotRemoval;
    }

    @Override // defpackage.fz2
    public void f(l99 l99Var) {
        l99Var.get().getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.te3
    public double c(double d) {
        return d;
    }
}
