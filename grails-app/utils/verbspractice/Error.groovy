package verbspractice

enum Error {
    NOT_FOUND(1, 'Entidad no encontrada'),
    FAILED_VALIDATION(2, 'Los datos ingresados tienen errores'),
    INTERNAL_ERROR(3, 'Error interno en el servidor')

    int id
    String description
}