package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e63  reason: default package */
/* loaded from: classes3.dex */
public final class e63 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q63 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e63(q63 q63Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = q63Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        q63 q63Var = this.b;
        switch (i) {
            case 0:
                return new e63(q63Var, m42Var, 0);
            default:
                return new e63(q63Var, m42Var, 1);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((e63) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((e63) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hre.r(obj);
                return o17.s(new yk8((char) 8231, (char) 183), new yk8((char) 8226, (char) 183), new yk8((char) 12290, '.'), new yk8((char) 65106, '.'), new yk8((char) 65294, '.'), new yk8((char) 65072, ':'), new yk8((char) 8758, ':'), new yk8((char) 65109, ':'), new yk8((char) 65306, ':'), new yk8((char) 65110, '?'), new yk8((char) 65311, '?'), new yk8((char) 65111, '!'), new yk8('.', '.'), new yk8('?', '?'), new yk8(':', ':'), new yk8('!', '!'));
            default:
                hre.r(obj);
                return o17.s(new yk8((char) 12296, (char) 10216), new yk8((char) 12297, (char) 10217), new yk8((char) 12298, (char) 10216), new yk8((char) 12299, (char) 10217), new yk8((char) 12288, ' '), new yk8(' ', ' '), new yk8((char) 713, (char) 175), new yk8((char) 8229, (char) 168), new yk8((char) 8231, (char) 183), new yk8((char) 8226, (char) 183), new yk8((char) 8245, '`'), new yk8((char) 65344, '`'), new yk8((char) 12290, '.'), new yk8((char) 65106, '.'), new yk8((char) 65294, '.'), new yk8('.', '.'), new yk8((char) 8230, (char) 8230), new yk8((char) 65104, ','), new yk8((char) 65292, ','), new yk8((char) 65105, ','), new yk8((char) 12289, ','), new yk8(',', ','), new yk8((char) 65072, ':'), new yk8((char) 8758, ':'), new yk8((char) 65108, ';'), new yk8((char) 65307, ';'), new yk8((char) 65109, ':'), new yk8((char) 65306, ':'), new yk8(':', ':'), new yk8((char) 65110, '?'), new yk8((char) 65311, '?'), new yk8('?', '?'), new yk8((char) 65111, '!'), new yk8((char) 65281, '!'), new yk8('!', '!'), new yk8((char) 65113, '('), new yk8((char) 65288, '('), new yk8((char) 65114, ')'), new yk8((char) 65289, ')'), new yk8((char) 65115, '{'), new yk8((char) 65371, '{'), new yk8((char) 65116, '}'), new yk8((char) 65373, '}'), new yk8((char) 12304, '['), new yk8((char) 65117, '['), new yk8((char) 65339, '['), new yk8((char) 12305, ']'), new yk8((char) 65118, ']'), new yk8((char) 65341, ']'), new yk8((char) 65342, '^'), new yk8((char) 65119, '#'), new yk8((char) 65283, '#'), new yk8((char) 65120, '&'), new yk8((char) 65286, '&'), new yk8((char) 65121, '*'), new yk8((char) 65290, '*'), new yk8((char) 65122, '+'), new yk8((char) 65291, '+'), new yk8('+', '+'), new yk8((char) 65123, '-'), new yk8((char) 65293, '-'), new yk8('-', '-'), new yk8((char) 65124, '<'), new yk8((char) 65308, '<'), new yk8((char) 65125, '>'), new yk8((char) 65310, '>'), new yk8('>', '>'), new yk8((char) 65126, '='), new yk8((char) 65309, '='), new yk8('=', '='), new yk8((char) 65129, '$'), new yk8((char) 65284, '$'), new yk8('$', '$'), new yk8((char) 65130, '%'), new yk8((char) 65285, '%'), new yk8((char) 65131, '@'), new yk8((char) 65312, '@'), new yk8((char) 8786, (char) 8776), new yk8((char) 8806, (char) 8804), new yk8((char) 8807, (char) 8805), new yk8((char) 65073, '|'), new yk8((char) 65372, '|'), new yk8((char) 65075, '|'), new yk8('|', '|'), new yk8((char) 65087, (char) 8743), new yk8((char) 65088, (char) 8744), new yk8((char) 65295, '/'), new yk8((char) 65340, '\\'), new yk8((char) 9588, '_'), new yk8((char) 65343, '_'), new yk8((char) 12300, (char) 8220), new yk8((char) 8220, (char) 8220), new yk8((char) 12301, (char) 8221), new yk8((char) 8221, (char) 8221), new yk8((char) 12302, (char) 8216), new yk8((char) 8216, (char) 8216), new yk8((char) 12303, (char) 8217), new yk8((char) 8217, (char) 8217), new yk8((char) 65282, '\"'), new yk8((char) 65374, '~'), new yk8((char) 65375, '('), new yk8((char) 65376, ')'), new yk8((char) 65345, 'a'), new yk8((char) 65346, 'b'), new yk8((char) 65347, 'c'), new yk8((char) 65348, 'd'), new yk8((char) 65349, 'e'), new yk8((char) 65350, 'f'), new yk8((char) 65351, 'g'), new yk8((char) 65352, 'h'), new yk8((char) 65353, 'i'), new yk8((char) 65354, 'j'), new yk8((char) 65355, 'k'), new yk8((char) 65356, 'l'), new yk8((char) 65357, 'm'), new yk8((char) 65358, 'n'), new yk8((char) 65359, 'o'), new yk8((char) 65360, 'p'), new yk8((char) 65361, 'q'), new yk8((char) 65362, 'r'), new yk8((char) 65363, 's'), new yk8((char) 65364, 't'), new yk8((char) 65365, 'u'), new yk8((char) 65366, 'v'), new yk8((char) 65367, 'w'), new yk8((char) 65368, 'x'), new yk8((char) 65369, 'y'), new yk8((char) 65370, 'z'), new yk8((char) 65313, 'A'), new yk8((char) 65314, 'B'), new yk8((char) 65315, 'C'), new yk8((char) 65316, 'D'), new yk8((char) 65317, 'E'), new yk8((char) 65318, 'F'), new yk8((char) 65319, 'G'), new yk8((char) 65320, 'H'), new yk8((char) 65321, 'I'), new yk8((char) 65322, 'J'), new yk8((char) 65323, 'K'), new yk8((char) 65324, 'L'), new yk8((char) 65325, 'M'), new yk8((char) 65326, 'N'), new yk8((char) 65327, 'O'), new yk8((char) 65328, 'P'), new yk8((char) 65329, 'Q'), new yk8((char) 65330, 'R'), new yk8((char) 65331, 'S'), new yk8((char) 65332, 'T'), new yk8((char) 65333, 'U'), new yk8((char) 65334, 'V'), new yk8((char) 65335, 'W'), new yk8((char) 65336, 'X'), new yk8((char) 65337, 'Y'), new yk8((char) 65338, 'Z'), new yk8((char) 65297, '1'), new yk8((char) 65298, '2'), new yk8((char) 65299, '3'), new yk8((char) 65300, '4'), new yk8((char) 65301, '5'), new yk8((char) 65302, '6'), new yk8((char) 65303, '7'), new yk8((char) 65304, '8'), new yk8((char) 65305, '9'), new yk8((char) 65296, '0'));
        }
    }
}
