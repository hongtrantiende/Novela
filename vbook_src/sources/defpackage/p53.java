package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p53  reason: default package */
/* loaded from: classes.dex */
public final class p53 extends RuntimeException {
    public final nw1 a;

    public p53(nw1 nw1Var) {
        this.a = nw1Var;
        if (!nw1Var.b) {
            int[] iArr = {201, 202, 204, 206, 207, Token.IF, -127, 126665345, Context.VERSION_ES6};
            List list = nw1Var.a;
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ow1 ow1Var = (ow1) list.get(i);
                if (!b00.R(ow1Var.a, iArr)) {
                    if (ow1Var.a == 100) {
                        int i3 = i + 2;
                        if (i3 < size && ((ow1) list.get(i3)).a == 1000) {
                            break;
                        }
                        xl1.S(arrayList);
                    } else {
                        arrayList.add(ow1Var);
                    }
                }
                i = i2;
            }
            int size2 = arrayList.size();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                stackTraceElementArr[i4] = new StackTraceElement("$$compose", a82.j(((ow1) arrayList.get(i4)).a, "m$"), "SourceFile", 1);
            }
            setStackTrace(stackTraceElementArr);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        nw1 nw1Var = this.a;
        if (nw1Var.b) {
            StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
            jq6 t = tl1.t();
            List list = nw1Var.a;
            list.getClass();
            z17 z17Var = new z17(list);
            int a = z17Var.a();
            for (int i = 0; i < a; i++) {
                ((ow1) z17Var.get(i)).getClass();
            }
            jq6 r = tl1.r(t);
            r.getClass();
            z17 z17Var2 = new z17(r);
            int a2 = z17Var2.a();
            for (int i2 = 0; i2 < a2; i2++) {
                sb.append("\tat ");
                sb.append((String) z17Var2.get(i2));
                sb.append('\n');
            }
            return sb.toString();
        }
        return "Composition stack when thrown:";
    }
}
